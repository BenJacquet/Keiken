# TCP/IP Basic Concepts

TCP/IP is a protocol suite used to transmit data over the internet. It stands for Transmission Control Protocol/Internet Protocol and is composed of several layers, each responsible for a specific function in the data transmission process.

## The Layers

TCP/IP is composed of four layers:

1. **Application layer**: This layer is responsible for creating and sending application-specific data. Examples of protocols at this layer include HTTP, FTP, SMTP, and Telnet.

2. **Transport layer**: This layer is responsible for ensuring that the data is transmitted reliably and without errors. It uses two protocols: TCP and UDP. TCP (Transmission Control Protocol) is a connection-oriented protocol that guarantees reliable data delivery, while UDP (User Datagram Protocol) is a connectionless protocol that does not guarantee reliable data delivery.

3. **Internet layer**: This layer is responsible for routing the data across the internet. It uses the Internet Protocol (IP) to do this. The IP is responsible for addressing the data and ensuring that it is transmitted to the correct destination.

4. **Link layer**: This layer is responsible for transmitting the data over the physical network. It uses several protocols, including Ethernet, Wi-Fi, and Bluetooth.

## Data Encapsulation

Data encapsulation is the process of adding headers and trailers to data as it passes through each layer of the protocol stack. Each layer adds its own header and trailer, with the data becoming the payload of the layer above it. This process continues until the data reaches the link layer, where it is transmitted over the physical network.

## Example of Data Transmission

Let's take the example of a machine trying to access a webpage from a web browser. When the user types in the URL of the webpage and hits enter, the web browser sends an HTTP request to the web server. The HTTP request is created at the application layer, with the data being the **URL of the webpage**.

The HTTP request is then passed to the transport layer, where it is encapsulated in a TCP segment. The TCP segment includes a header with information such as the source and destination **port numbers**, **sequence number**, and **acknowledgement number**.

The TCP segment is then passed to the internet layer, where it is encapsulated in an IP packet. The IP packet includes a header with information such as the **source and destination IP addresses** and the **protocol used** (TCP in this case).

The IP packet is then passed to the link layer, where it is encapsulated in an Ethernet frame. The Ethernet frame includes a header with information such as the **source and destination MAC addresses**.

The Ethernet frame is then transmitted over the physical network to the web server. The web server receives the Ethernet frame, and the process of decapsulation occurs in reverse order. The web server extracts the HTTP request from the TCP segment, the TCP segment from the IP packet, and the IP packet from the Ethernet frame.

The web server then creates an HTTP response, which is transmitted back to the web browser following the same process in reverse order.