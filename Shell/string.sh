#!/bin/sh


# s1=s2
# s1!=s2
# -n str string not null
# -z str string is null


str1="hello"
str2="hewfwllo"

if [ -n $str1 && -n $str2 ]
then
    if [ $str1 = $str2 ]
    then
        echo "Equal"
    else
        echo "Un Equal"
    fi
fi