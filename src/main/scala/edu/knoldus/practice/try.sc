class A
class B extends  A
class C extends B


def method[T <: A, U >: C](ele: T): A = {
  ele match {
    case y: C => new C
    case x: B => new B
  }
}

def method2[](x: A)
