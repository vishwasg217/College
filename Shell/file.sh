#! /bin/sh


# -f file
# -r readable
# -w writeable
# -x 
# -d
# -s

# -e

file=$1

if [ ! -e $1 ]
then 
    echo "file doesnt exist"
elif [ ! -r $1 ]
then
    echo "file not readable"
else 
    echo "file is readable"
fi