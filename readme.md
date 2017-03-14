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

println() doesn't work. use global.print()

