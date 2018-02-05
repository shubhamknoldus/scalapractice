package mathoperation.test

import edu.knoldus.practice.testing.MathOperation
import org.scalatest.FunSuite

class MathOperationTestWithFunSuit extends FunSuite {

  val mathOperationObj = new MathOperation
  test("Add should addition of two") {
    assert(mathOperationObj.add(2, 3) == 5)
  }
  test("Subtraction should return difference of two") {
    assert(mathOperationObj.subtraction(3, 2) == 1)
  }
  test("Multiplication should return multiplication") {
    assert(mathOperationObj.multiplication(3, 2) == 6)
  }
  test("Divide ") {
    assert(mathOperationObj.divide(23, 2) == 11)
  }
  test("divide by zero") {
    assertThrows[ArithmeticException] (mathOperationObj.divide(23, 0))
  }
}
