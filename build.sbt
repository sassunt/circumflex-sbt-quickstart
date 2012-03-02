seq(webSettings :_*)

organization := "Circumflex"

name := "Circumflex Quick Start Project"

scalaVersion := "2.9.1"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "ru.circumflex" % "circumflex-web" % "2.1" % "compile",
  "ru.circumflex" % "circumflex-core" % "2.1" % "compile",
  "ru.circumflex" % "circumflex-ftl" % "2.1" % "compile",
  "org.mortbay.jetty" % "jetty" % "6.1.26" % "container"
)

resolvers ++= Nil
