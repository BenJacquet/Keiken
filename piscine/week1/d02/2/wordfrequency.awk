#!/usr/bin/awk -f

BEGIN {
	FS="[ \t\n]+"
	print "Word occurence in file '" ARGV[1] "':"
}

{
	for (i = 1; i <= NF; i++) {
		count[tolower($i)]++
	}
}

END {
	for (word in count) {
		printf "%-20s %s\n", word, count[word]
	}
}