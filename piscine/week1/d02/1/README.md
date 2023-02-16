## Display a list of all the users on your system who log in with the Bash shell as a default.

```
awk '/\/bin\/bash$/{print $0}' /etc/passwd
```

## From the /etc/group directory, display all lines starting with the string "daemon".

```
awk '/^daemon/{print $0}' /etc/group
```

## Print all the lines from the same file that don't contain the string.

```
awk '!/^daemon/{print $0}' /etc/group
```

## Display localhost information from the /etc/hosts file, display the line number(s) matching the search string and count the number of occurrences of the string.

```
awk '/localhost/ { print "Line "NR ":\t" $0} /localhost/ { count++ } END {print "\nTotal occurences: " count}' /etc/hosts
```

## Display a list of /usr/share/doc subdirectories containing information about shells.

```
find /usr/share/doc/ -type d | awk -F '/' '{if ($4 == "doc" && ($5 ~ /^sh$/ || $5 ~ /^zsh$/ || $5 ~ /^bash$/ || $5 ~ /^shell$/)) print $0}'
```

## How many README files do these subdirectories contain? Don't count anything in the form of "README.a_string".

```
find /usr/share/doc/ -type f | awk -F '/' '{if ($4 == "doc" && ($5 ~ /^sh$/ || $5 ~ /^zsh$/ || $5 ~ /^bash$/ || $5 ~ /^shell$/)) print $0}' | grep README | wc -l

```

## Make a list of files in your home directory that were changed less that 10 hours ago, using grep, but leave out directories.

```
find /home -maxdepth 1 -type f -mmin -600 | grep -v "/$"
```

![Alt text](../screenshots/1-1.jpg?raw=true "Demo")

## Can you find an alternative for wc -l, using grep?

```
grep -c "$" <filename>
```

![Alt text](../screenshots/1-2.jpg?raw=true "Demo")

## Using the file system table (/etc/fstab for instance), list local disk devices.

```
grep -v '#' /etc/fstab
```

![Alt text](../screenshots/1-3.jpg?raw=true "Demo")

## Display configuration files in /etc that contain numbers in their names.

```
find /etc -type f -name '*[0-9]*.conf'
```

![Alt text](../screenshots/1-4.jpg?raw=true "Demo")

## At least two games from Regex Crossword 

OK but beginner only

![Alt text](../screenshots/1-5.jpg?raw=true "Demo")