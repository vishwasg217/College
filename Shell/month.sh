#! /bin/sh
#write a pgm to read month name and output number of days

echo "Enter month name: "
read month

case $month in 
february) echo "there are 28/29 days";;
january|march|may|july|august|october|december) echo "31 days";;
*) echo "30 days";;
esac