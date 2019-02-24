// 1. type alias
// 2. how to use list of tuple

type X = List[(Int, Int)] //list of tuple
val a: X = List((1, 1))

//Example 1
def func(arg1: X): Unit = println(arg1:X)
func(a:X)

// Example 2
def func2(arg1: X, arg2: X, arg3: X): Unit = {
  println(arg1, arg2, arg3)
}
func2(a:X, a:X, a:X)
