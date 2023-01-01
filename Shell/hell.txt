#read choice
# case "$choice" in
# 1) ls;;
# 2) ps;;
# 3) date;;
# 4) who;;
# 5) exit;;
# *) "invalid";;
# esac

case `date | cut -d " " -f1` in
Mon) echo "Its monday";;
Tue) echo "tuesday";;
*) echo "invalid";;
esac
