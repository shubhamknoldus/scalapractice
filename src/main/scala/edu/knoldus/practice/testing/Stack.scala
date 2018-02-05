package edu.knoldus.practice.testing

class Stack(val stack: List[Int] = List.empty) {
  def push(element: Int): List[Int] = {
    if(stack.length == 10){
      println("stack is full")
      stack
    } else {
      element :: stack
    }
  }
  def pop: Int ={
    if(stack.isEmpty){
      throw new ArrayIndexOutOfBoundsException()
    } else {
      stack match {
        case head :: _ => head
      }
    }
  }
}
