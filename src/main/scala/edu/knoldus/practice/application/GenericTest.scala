package edu.knoldus.practice.application

import edu.knoldus.practice.operations.classes.{Animal, Cat, Dog}

object GenericTest extends App {

  val mapTest = Map(1 -> Dog("hi"), 2 -> Cat("hello"))

  printType(mapTest)

  def printType[T <: Animal](mapList: Map[Int, T]): Unit ={
    for((x: Int, y: T) <- mapList){
      y match {
        case x@Dog(qwerty) => println(s"this is a dog ${x.saySomeThing} $qwerty")
        case z@Cat(qweqweqwe) => println(s"this is a dog ${z.saySomeThing} $qweqweqwe")
      }
    }
  }
}
