ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.13" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "eureka-scala",
    idePackagePrefix := Some("com.eureka")
  )

