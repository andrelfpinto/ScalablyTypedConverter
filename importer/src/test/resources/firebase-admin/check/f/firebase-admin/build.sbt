organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.2.0-36cd64"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.3-7a004f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        