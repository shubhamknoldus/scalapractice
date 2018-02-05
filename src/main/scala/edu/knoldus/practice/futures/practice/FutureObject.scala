package edu.knoldus.practice.futures.practice

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureObject extends App {


  /*def method: Future[String] = Future{
    "hi how are you"
    //throw new RuntimeException("exception thrown")
  }


  def method2 = Future{
    Thread.sleep(100)
    List(1,2,3,4,5)
  }
  method2
  method*/
  val x = Future(1)
  val y = Future(2)
  val z = Future(3)
  val a = x.map(zxc => y.map(qwe => z.map(t => t * qwe * zxc)))

  Thread.sleep(1234)
  println(a)
  /*method onComplete{
    case Success(x) => println(x)
    case Failure(y) => println(y.getMessage)
  }

  method2 onComplete {
    case Success(x) => x.map(x => println(x * 2))
    case Failure(u) => println(s"$u")
  }
  Thread.sleep(2000)*/
}
