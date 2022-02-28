#!/bin/bash
x=2
while [ $x -le 27 ]
do
	cp -r ../Scala/UniversityWork/week1 ../Scala/UniversityWork/week$x
	x=$(( $x + 1 ))
done
