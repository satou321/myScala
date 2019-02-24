//構造的部分型 Structural Subtyping
//ダックタイピングと似たような動作をさせることができる

//IO型を定義
type IO = {
  def open(src: String): Boolean
  def close: Unit
}

//IO型を受け取る関数を定義
def func(io: IO, src: String) = {
  io.open(src)
  println("func exe")
  io.close
}

//IO型の派生型
class FileIO {
  def open(src: String): Boolean = {
    println(src + "file open");
    true
  }
  def close:Unit=println("file close")
}
//IO型の派生型
class DatabaseIO {
  def open(url: String): Boolean = {
    println(url + "con open");
    true
  }

  def close = println("con close")
}

//IO型と各クラスには継承関係はないが、引数として渡すことができる
func(new FileIO, "test.txt")
func(new DatabaseIO, "test.txt")
