name := "get-the-timezone-time"
version := "0.1"
scalaVersion := "3.1.2"

val Http4sVersion = "0.23.11"
 
libraryDependencies ++= List(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "ch.qos.logback"  %  "logback-classic"     % "1.2.3"
)