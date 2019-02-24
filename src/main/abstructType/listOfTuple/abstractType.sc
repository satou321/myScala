// 1. type alias
// 2. how to use list of tuple

type X = List[(Int, Int)] //list of tuple
val a: X = List((1, 1))

//Example 1
def func(arg1: X)
func(a)

// Example 2
def func2(arg1: X, arg2: X, arg3: X)
func2(a, a, a)
