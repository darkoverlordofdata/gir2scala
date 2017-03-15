# gir2scala 

ScalaJS Facades generated from Gir

Use Gtk, Soup, etc., on desktop from scalaJs


## example
```
git clone git@github.com:darkoverlordofdata/gir2scala.git
cd gir2scala
sbt fastOptJS
cat src/js/prolog.js target/scala-2.11/example-jsdeps.js target/scala-2.11/example-fastopt.js src/js/main.js > bin/example
chmod +x bin/example
bin/example
```

## stuff

Scala enums are objects, c enums are longs. As compromise, gir enums are objects that have readonly numbers as properties, sort of like the way you fake enums in java. 