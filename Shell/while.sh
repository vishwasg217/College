#!/bin/bash

echo  "How many terms to be generated?"
read n
i=2;x=0;y=1;
echo "Fibonacci series upto $n terms\n"
echo -n "$x $y "
while [ $i -lt $n ]
do 
    z=`expr $x + $y`
    echo -n "$z "
    x=$y; y=$z
    i=`expr $i + 1`
done
echo 