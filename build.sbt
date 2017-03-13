
enablePlugins(ScalaJSPlugin)

name := "example"

scalaVersion := "2.11.8" // or any other Scala version >= 2.10.


jsDependencies += ProvidedJS / "polyfill.js"

skip in packageJSDependencies := false