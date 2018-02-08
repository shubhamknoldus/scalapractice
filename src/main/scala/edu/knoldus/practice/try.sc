/*class A
class B extends  A
class C extends B


def method[T <: A, U >: C](ele: T): A = {
  ele match {
    case y: C => new C
    case x: B => new B
  }
}*/


val x = List("Smart Phone", "Mens wear", "Wrist Watch", "Deodorant", "Laptop", "Juicer and Grinders")


x.sortWith((a, b) => a <= b)

val y = List(("shubham", 2), ("verma", 2), ("ayush", 3), ("Randhir", 5))
y.sortWith((a,b) => a._2 >= b._2)
y.reverse.sortWith((a,b) => a._2 >= b._2)
