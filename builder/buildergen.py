
import sys

for i in range(0,int(sys.argv[1])):
	for j in range(0,5):
		print "public void set"+str(i)+str(j)+"(){"
		print "\tvalues["+str(i)+"] = "+str(j)+";"
		print "}"
