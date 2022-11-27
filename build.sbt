ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.0"
ThisBuild / idePackagePrefix := Some("com.eureka")

Global / excludeLintKeys += idePackagePrefix
Test / logBuffered := false

lazy val root = (project in file("."))
  .settings(
    name := "eureka-scala",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test",
    libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.14" % "test",
    libraryDependencies += "org.scalatestplus" %% "mockito-4-6" % "3.2.14.0"
  )


