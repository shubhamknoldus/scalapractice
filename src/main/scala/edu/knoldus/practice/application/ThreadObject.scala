package edu.knoldus.practice.application


class MyThread extends Thread{
  override def run(): Unit = {
    println(Runtime.getRuntime.availableProcessors())
  }
}

object ThreadObject extends App {
  val tObj = new MyThread
  tObj.start()
  println("exiting")
}
