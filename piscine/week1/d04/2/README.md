# Performing an HTTP request to a web server using Telnet
Open a terminal window and type the following command to connect to the server using Telnet:

```
telnet [server hostname or ip_adress] [port_number]
```

Send an HTTP request to the server using the following format:

```
GET / HTTP/1.1
```

Hit Enter twice to send the request to the server.

![Alt text](./screenshots/1.jpg?raw=true "Demo")

Wait for the server to respond. The response will be displayed in the terminal window (In this example we redirect output to another file for better visibility).

![Alt text](./screenshots/2.jpg?raw=true "Demo")

If we try to open this file inside a web browser:

![Alt text](./screenshots/3.jpg?raw=true "Demo")

We get the (incomplete here) Google frontpage in our browser!

<br>


# Intercepting a request emitted from a web browser on a Netcat server
Open a terminal window and type the following command to start a Netcat server:

```
nc -vlp [port_number]
```

![Alt text](./screenshots/4.jpg?raw=true "Demo")

Send a request to your netcat server by entering <localhost>:<portnumber> in the web browser.

![Alt text](./screenshots/5.jpg?raw=true "Demo")

The request will be intercepted by the netcat server and will be displayed in the terminal window.

![Alt text](./screenshots/6.jpg?raw=true "Demo")

Congratulations!

<br>

# Differences between HTTP1 and HTTP2
HTTP/1 more precisely HTTP/1.1 has been the standard protocol for transferring data over the web for over 15 years.

HTTP/2 is the next version of the protocol, which was developed to address some of the limitations of HTTP/1.

## Here are some of the key differences between the two protocols:

- Security: HTTP/2 requires the use of SSL/TLS encryption, which provides better security than the plaintext connections used by HTTP/1.

- Multiplexing: HTTP/2 allows for multiple requests to be sent and received at the same time over a single connection. This reduces the amount of time it takes to load a web page and can lead to faster performance.

- Binary format: HTTP/2 uses a binary format for data transfer, which is more efficient than the text-based format used by HTTP/1. This allows for faster parsing and processing of data.

- Server push: HTTP/2 allows servers to push data to the client without waiting for the client to request it. This can help to reduce the number of round trips required to load a web page.

- Header compression: HTTP/2 uses header compression to reduce the size of the headers that are sent with each request. This can help to reduce the amount of bandwidth required to transfer data.

Overall it is a much needed upgrade on security, both bandwidth and processing power efficiency and server possibilities over its predecessor.
