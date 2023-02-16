## 1. all files under the /etc directory whose names begin with rc

```
find /etc -name "rc*"
```

![Alt text](../screenshots/2-1.jpg?raw=true "Demo")

## 2. all regular files belonging to you; put the result in the file /tmp/findme and errors in/dev/null

```
find /etc -type f -user $USER > /tmp/findme 2>& /dev/null
```

![Alt text](../screenshots/2-2.jpg?raw=true "Demo")

## 3. all subdirectories of /etc

```
find /etc -type d
```

![Alt text](../screenshots/2-3.jpg?raw=true "Demo")

## 4. all regular files under your home directory that have not been modified in the last 10 days

```
find .. -type f -mtime -10
```

![Alt text](../screenshots/2-4.jpg?raw=true "Demo")

## 5. The 10 largest file in your computer (I used another folder for the screenshot as it took too long)

```
find / -type f -printf "SIZE: %s bytes  NAME: %p\n" | sort -r | head
```

![Alt text](../screenshots/2-5.jpg?raw=true "Demo")