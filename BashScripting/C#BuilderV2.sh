#!/bin/bash

# File Destination
cd
cd $1
mkdir $2
cd $2

# Loop
for var in "$@"
do
    if [ $var != $1 ] && [ $var != $2 ]
    then
        mkdir $var
	cd $var

	dotnet new console

	rm Program.cs
	touch $var.cs
	echo "using System; \n\nnamespace $var{ \n    class Program{ \n        static void Main(string[] args){ \n            Console.WriteLine(\"Hello World\"); \n        } \n    } \n}" >> $var.cs

	cd ..
    fi
done

echo "Completed Me"
