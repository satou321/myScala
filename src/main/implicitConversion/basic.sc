/*
 暗黙の型変換 implicit conversion

 Point:
  ・implicit必須

  ・単一の識別子としてスコープ内にあること
  （別パッケージ、別オブジェクトだと、importで単一識別子として使用
  ・コンパニオンオブジェクト内にimplicit定義あれば例外的にOK

  ・暗黙変換されたものをさらに暗黙変換は不可

  ・同じシグネチャを持つものがあるとエラー

  ・型チェックで問題なければ暗黙の型変換は行われない

  ・予期しない型変換防止のため、専用オブジェクトに定義して、個別にimportする
*/

// 以下は普通ならエラー
// var str: String = 10

// 関数名は何でも良い
//引数に変換元の型、戻り値に変換先の型を指定する
implicit def intToString(num: Int): String = {
  println("int to string")
  num.toString
}
val str2: String = 10

//===Example 2
implicit def dateToString(data: java.util.Date): String = {
  import java.text._
  println("covnert java.util.Date to String")
  val sdf =
    new SimpleDateFormat("yyy/MM/dd HH:mm:ss")
  sdf.format(data)
}

val strDate:String=new java.util.Date()

