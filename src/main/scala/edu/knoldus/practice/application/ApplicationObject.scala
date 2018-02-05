package edu.knoldus.practice.application

import edu.knoldus.practice.operations.classes.Point
import org.apache.log4j.Logger

object ApplicationObject extends App {

  import ImplicitHelper._
  val logger = Logger.getLogger(this.getClass)

  implicit def method(list: List[String]): String ={
    list.head
  }
  val y = List("shubham","verma")
  val x: String = List("shubham","verma")
  logger.info(s"$x\n")
  logger.info(s"${y.printConsecutive}")
  logger.info(s"${2 x 3}")

}

object ImplicitHelper{
  implicit class PrintConsecutive[T](list: List[T]){
    def printConsecutive: List[T] ={
      for(x <- list if (list.indexOf(x) + 1) % 2 == 0) yield {x}
    }
  }

  implicit class PointHelper(x: Int){
    def x(y: Int): Point ={
      Point(x, y)
    }
  }
}