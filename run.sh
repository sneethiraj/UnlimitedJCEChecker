#!/bin/bash
mvn package > /dev/null 2>&1 && java -jar `ls -1 target/*.jar  | head -1`
