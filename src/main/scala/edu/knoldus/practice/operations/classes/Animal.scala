package edu.knoldus.practice.operations.classes

abstract class Animal(val voice: String) {
  def saySomeThing: String
}

case class Dog(override val voice: String) extends Animal(voice){
  override def saySomeThing: String = "Bhaw Bhaw"
}

case class Cat(override val voice: String) extends Animal(voice){
  override def saySomeThing: String = "Meow Meow"
}