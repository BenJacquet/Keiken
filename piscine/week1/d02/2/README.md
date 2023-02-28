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

![Alt text](../screenshots/2-1.jpg?raw=true "Demo")

## Create an AWK script that show the number of repetition of a specific string in a list of strings then inverse it.
```
IN PROGRESS
```

## Given a list of telephone numbers of the form 123456789 use sed to rewrite them as (123)456-789.
```
sed -E 's/^[0-9]{9}$/&/; s/^([0-9]{3})([0-9]{3})([0-9]{3})$/(\1)\2-\3/'
```

![Alt text](../screenshots/2-3.jpg?raw=true "Demo")

## Use sed to select and convert all file names with suffix .html given as output by ls into capital letters with suffix .HTM. Check out command y in sed man page
```
sed -E '/\.html$/ { s/[a-z]/\U&/g; s/\.HTML$/.HTM/g; }'
```

![Alt text](../screenshots/2-4.jpg?raw=true "Demo")

## Use sed to extract full user names from /etc/passwd/
```
sed 's/:.*//' /etc/passwd | sort
```

![Alt text](../screenshots/2-5.jpg?raw=true "Demo")

## Write a program with the following behavior: 
- Threads are created (their number being passed as a parameter when launching the program);
- Each thread displays a message (for example Hello  !);
- The principal thread waits for the termination of the various threads created
- Each thread shows his PID
- Edit the program that each thread receive it’s priority & print it.

```C
#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/syscall.h>
#include <sys/types.h>

void *thread(void *arg)
{
	int thread_id = *(int *)arg;
	// POSIX THREAD ID (LONG INT)
	// pthread_t thread_pid = pthread_self();

	// OS THREAD ID (INT)
	pid_t thread_pid = syscall(SYS_gettid);
	int thread_priority = sched_get_priority_min(SCHED_FIFO) + thread_id;
	struct sched_param params;

	params.sched_priority = thread_priority;

	int result = pthread_setschedparam(pthread_self(), SCHED_FIFO, &params);
	printf("Thread %d - PID [%d] - priority [%d]: Hello !\n", thread_id, thread_pid, thread_priority);
	return NULL;
}

int main(int argc, char **argv)
{
	if (argc != 2 || atoi(argv[1]) == 0) {
		printf("Usage: %s <number of threads to launch>\n", argv[0]);
		exit(1);
	}
	int thread_nbr = atoi(argv[1]);
	pthread_t threads[thread_nbr];

	for (int i = 0; i < thread_nbr; i++) {
		int *thread_id = malloc(sizeof(int));
		*thread_id = i + 1;
		int result = pthread_create(&threads[i], NULL, thread, thread_id);
		free(thread_id);
	}

	for (int i = 0; i < thread_nbr; i++) {
		int result = pthread_join(threads[i], NULL);
	}
	return 0;
}
```

![Alt text](../screenshots/2-6.jpg?raw=true "Demo")