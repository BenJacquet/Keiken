## 1. all files under the /etc directory whose names begin with rc

```
find /etc -name "rc*"
```

## 2. all regular files belonging to you; put the result in the file /tmp/findme and errors in/dev/null

```
find /etc -type f -user $USER > /tmp/findme 2>& /dev/null
```
## 3. all subdirectories of /etc

```
find /etc -type d
```

## 4. all regular files under your home directory that have not been modified in the last 10 days

```
find .. -type f -mtime -10
```

## 5. The 10 largest file in your computer

```
find / -type f -printf "SIZE: %s bytes  NAME: %p\n" | sort -rn | head -10
```