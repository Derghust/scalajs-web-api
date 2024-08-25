ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.5.0"

enablePlugins(ScalaJSPlugin)

lazy val root = (project in file("."))
  .settings(
    name := "scaljs-web-api",
    idePackagePrefix := Some("org.derghust.scalajs.web.api"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.8.0",
    )
  )
