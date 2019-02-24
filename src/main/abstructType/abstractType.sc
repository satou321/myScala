//抽象型

abstract class Base {
  type X //抽象型

  def show(a: X)
}


class B {
  def exec = println("Foo#exec")
}

class E1 extends Base {
  type X = B

  def show(a: X): Unit = a.exec
}

val x = new E1
x.show(new B)

