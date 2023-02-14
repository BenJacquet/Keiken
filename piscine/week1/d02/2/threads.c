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
	}

	for (int i = 0; i < thread_nbr; i++) {
		int result = pthread_join(threads[i], NULL);
	}
	return 0;
}