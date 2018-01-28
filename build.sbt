// build.sbt
//
scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "utf8",
  "-feature",
  "-unchecked",
  "-language", "postfixOps"
)

crossScalaVersions := Seq("2.12.4", scalaVersion.value)

version := "0.0.1"
