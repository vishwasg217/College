#!/bin/bash
#write a pgm accept name ans usn till user presses the letter n

ans=y
while [ ans="y" ]
do 
    echo "Enter the student name and usn: "
    read name usn
    echo "$name|$usn" 
    echo "continue?(y/n)"
    read ch
    case $ch in 
    y*|Y*)ans=y;;
    n*|N*)exit;;
    *)ans=y;;
    esac 
done