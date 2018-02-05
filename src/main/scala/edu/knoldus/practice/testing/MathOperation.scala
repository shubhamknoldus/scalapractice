package edu.knoldus.practice.testing

class MathOperation {
  def add(firstOperand: Int, secondOperand: Int) = firstOperand + secondOperand
  def multiplication(firstOperand: Int, secondOperand: Int) = firstOperand * secondOperand
  def subtraction(firstOperand: Int, secondOperand: Int) = firstOperand - secondOperand
  def divide(firstOperand: Int, secondOperand: Int) = if(secondOperand == 0) throw new ArithmeticException("cannot divide by zero") else firstOperand / secondOperand
}
