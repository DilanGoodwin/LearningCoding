#!/bin/bash

# File Destination
cd 
cd $1
mkdir $2
cd $2

# Creating Folders
mkdir -p src/main/scala/
mkdir -p src/test/scala/
mkdir project

# Creating Files
touch build.sbt
touch src/main/scala/template.scala
touch src/test/scala/template.scala
touch project/Dependencies.scala
touch project/build.properties

# Adding Content Files
echo "import Dependencies._\n\nThisBuild / scalaVersion := \"2.13.7\"\nThisBuild / version := \"0.1.0-SNAPSHOT\"\n\nlazy val root = (project in file(\".\"))\n  .settings(\n    name := \""$2"\",\n    libraryDependencies += scalaTest % Test\n  )" >> build.sbt
echo "import sbt._\n\nobject Dependencies {\n  lazy val scalaTest = \"org.scalatest\" %% \"scalatest\" % \"3.2.9\"\n}" >> project/Dependencies.scala
echo "sbt.version=1.6.2" >> project/build.properties
echo "object template{\n  def main(args:Array[String]): Unit={\n    println(\"Hello World\")\n  }\n}" >> src/main/scala/template.scala
