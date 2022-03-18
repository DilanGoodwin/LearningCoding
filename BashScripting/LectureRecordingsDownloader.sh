#!/bin/bash

if [ $1 -eq 1 ]
  then
    cd $2
    youtube-dl -o "$3.%(ext)s" $4
fi

