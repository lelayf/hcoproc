name := "hcoproc"

organization := "com.viadeo"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "org.apache.hbase"  % "hbase"       % "0.94.6",
    "org.apache.hadoop" % "hadoop-core" % "1.0.2"
)

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

publishMavenStyle := true

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

