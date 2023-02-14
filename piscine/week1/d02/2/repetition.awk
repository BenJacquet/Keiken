#!/usr/bin/awk -f

BEGIN {
	if (ARGC < 3) {
		print "Usage: ./repetition <substring to search> <set of strings>"
		exit
	}
	print "Occurence of substring '" ARGV[1] "':"
	for (i = 2; i < ARGC; i++) {
		count = gsub(ARGV[1] ARGV[1], ARGV[i])
		print "Testing string '" ARGV[i]"': " count;
	}
}