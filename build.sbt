// build.sbt
//
name := "sbt2901a"

scalaVersion := "2.12.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "utf8",
  "-feature",
  "-unchecked",
  "-language", "postfixOps"
)

crossScalaVersions := Seq("2.11.8", scalaVersion.value)
