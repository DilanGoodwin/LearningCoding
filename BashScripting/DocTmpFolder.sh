#!/bin/bash

cd ~/Documents

if [ -a /tmp ]
  then
    rm -r tmp
fi

mkdir tmp
