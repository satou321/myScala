// 暗黙の引数
//https://www.atmarkit.co.jp/ait/articles/1208/24/news138_2.html

//普通の書き方
def sum(x: Int, y: Int, z: Int): Int = x + y + z
val x1 = sum(1, 2, 3)

//めんどくさい普通の書き換え
def sum2(x: Int)(y: Int)(z: Int) = x + y + z
val x2 = sum2(1)(2)(3)

//★implicit parameter

//定義
def greeting(name: String)(implicit greet: String):Unit = {
  println(greet + name)
}


//エラー
//greeting("taro")

//暗黙的な値がない場合、引数を明示的に指定すれば使える
//greeting("taro")("good morning!")

// 暗黙的の引数
implicit val a:String="hello2!"

greeting("taro")
