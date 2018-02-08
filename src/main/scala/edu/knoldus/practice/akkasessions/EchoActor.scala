package edu.knoldus.practice.akkasessions

import akka.actor.{Actor, ActorSystem, Props}
import akka.util.Timeout
import scala.concurrent.duration.DurationInt
import akka.pattern.ask

class EchoActor extends Actor{
  var counter = 0
  println(sender())
  println(self)
  override def receive = {
    case msg =>
      sender() ! s"hello i am in actor receiving a message $msg"
  }
}

object EchoActor extends App {
  val system = ActorSystem("EchoActor")
  val props = Props[EchoActor]
  val ref = system.actorOf(props)
  implicit val timeOut = Timeout(1000 seconds)
  import scala.concurrent.ExecutionContext.Implicits.global
  val res = ref ? "hey hello i am being passed"
  res.map(x => println(x))

}