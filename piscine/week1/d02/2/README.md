## Give the AWK script that displays the word frequency of a text.
```
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
		print "'" word "' - ", count[word]
	}
}
```

## Create an AWK script that show the number of repetition of a specific string in a list of strings then inverse it.
```
IN PROGRESS
```

## Given a list of telephone numbers of the form 123456789 use sed to rewrite them as (123)456-789.
```
sed -E 's/^[0-9]{9}$/&/; s/^([0-9]{3})([0-9]{3})([0-9]{3})$/(\1)\2-\3/'
```

## Use sed to select and convert all file names with suffix .html given as output by ls into capital letters with suffix .HTM. Check out command y in sed man page
```
sed -E '/\.html$/ { s/[a-z]/\U&/g; s/\.HTML$/.HTM/g; }'
```

## Use sed to extract full user names from /etc/passwd/
```
sed 's/:.*//' /etc/passwd | sort
```

## Write a program with the following behavior: 
- Threads are created (their number being passed as a parameter when launching the program);
- Each thread displays a message (for example Hello  !);
- The principal thread waits for the termination of the various threads created
- Each thread shows his PID
- Edit the program that each thread receive it’s priority & print it.