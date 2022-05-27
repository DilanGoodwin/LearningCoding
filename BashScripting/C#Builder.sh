#!/bin/bash

# File Destination
cd
cd $1
mkdir $2
cd $2

# Loop
for var in "$@"
do
    if [ $var != $1 ]
    then
        if [ $var != $2 ]
        then
            mkdir $var
	    cd $var
	    dotnet new console
	    cd ..
	fi
    fi
done

echo "Completed Me"
