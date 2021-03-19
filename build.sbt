import sbt.Keys.{libraryDependencies, organization}


val appName = "scalatest-embedmongo"


val root = Project(appName, file("."))
  .enablePlugins(LibraryReleasePlugin)
  .settings(
    name:= appName,
    organization := "gg.gov.revenue",
    description := "API to use embedded mongoDb database for testing in Scala",

    scalaVersion := "2.13.1",

    libraryDependencies ++= Seq(
      "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "2.2.0",
      "org.scalatest" %% "scalatest" % "3.0.8" % "test",
      "org.mongodb.scala" %% "mongo-scala-driver" % "2.7.0" % "test"
    ),

    dependencyOverrides ++= Seq(
      "org.apache.commons" % "commons-compress" % "1.19"
    ),

    parallelExecution := false,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false }
  )