# 'w' mode deletes everything and then starts writing

file = open('text.txt', 'w')
file.write('japan\n')
file.write('UAE\n')
file.close()  #needed for saving changes
