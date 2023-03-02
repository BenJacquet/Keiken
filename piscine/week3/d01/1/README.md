### Creating a jail
![screenshot](./screenshots/0.jpg "Demo")

### Downloading an OCI image from docker and unpacking it to a useable filesystem
![screenshot](./screenshots/1.jpg "Demo")

### Running a chrooted bash inside our new filesystem
![screenshot](./screenshots/2.jpg "Demo")

### Mounting /proc and listing all running processes
![screenshot](./screenshots/3.jpg "Demo")

### Mounting /sys and listing all networks
![screenshot](./screenshots/4.jpg "Demo")

### Listing the namespaces of current process
![screenshot](./screenshots/5.jpg "Demo")

### Using unshare to create namespaces to isolate our jail
![screenshot](./screenshots/6.jpg "Demo")

### Trying hostname
![screenshot](./screenshots/7.jpg "Demo")

### Trying pid isolation
![screenshot](./screenshots/8.jpg "Demo")

### Trying network isolation
![screenshot](./screenshots/9.jpg "Demo")

### Creating a new network in our isolated jail
![screenshot](./screenshots/10.jpg "Demo")

### Trying to ping localhost
![screenshot](./screenshots/11.jpg "Demo")

### Setting up my network and pinging again
![screenshot](./screenshots/12.jpg "Demo")

### Creating another network to communicate with
![screenshot](./screenshots/13.jpg "Demo")

### Displaying informations
![screenshot](./screenshots/14.jpg "Demo")

### Setup
![screenshot](./screenshots/15.jpg "Demo")

### Ping test
![screenshot](./screenshots/16.jpg "Demo")

### Creating a new user namespace and performing a whoami
![screenshot](./screenshots/17.jpg "Demo")

### Testing control groups
![screenshot](./screenshots/18.jpg "Demo")

### Limiting memory, swappiness and processor usage
![screenshot](./screenshots/19.jpg "Demo")

### Running a program that reaches the limit set earlier
![screenshot](./screenshots/20.jpg "Demo")

### Running a forked bash with a new pid namespace and checking its isolation
![screenshot](./screenshots/21.jpg "Demo")

### Entering the bash process namespaces by targetting its pid
![screenshot](./screenshots/23.jpg "Demo")

### Using runc to launch a bash in our debian container
![screenshot](./screenshots/24.jpg "Demo")