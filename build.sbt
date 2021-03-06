name := "scalapractice"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "log4j" % "log4j" % "1.2.17"
// https://mvnrepository.com/artifact/org.scalatest/scalatest
//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % Test
libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
coverageEnabled := true
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.9"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test
