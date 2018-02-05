package mathoperation.test

import org.scalatest.{FlatSpec, Matchers}
import edu.knoldus.practice.testing.MathOperation

class MathOperationTestWithFlatSpec extends FlatSpec with Matchers{
  val mathOperationTest = new MathOperation

  "Addition of 2 and 3" should "return 6"in {
    assert(mathOperationTest.add(16, 8)  == 24)
  }
  "Subtraction" should "subtraction should return " in {
    assert(mathOperationTest.subtraction(16, 8) == 8)
  }
  "multiply" should "multiplication should return 6" in {
    assert(mathOperationTest.multiplication(2, 3) == 6)
  }
  "divide" should "divide should return 2" in {
    assert(mathOperationTest.divide(16, 8) == 2)
  }
  it should "through exception on dividing by zero" in {
    assertThrows[ArithmeticException](mathOperationTest.divide(12, 0))
  }

}
