# ARP Poisoning

## What is is ?

ARP (Address Resolution Protocol) poisoning, also known as ARP spoofing, is a type of cyber attack that takes advantage of the weaknesses in the ARP protocol to intercept, modify or steal data transmitted over a local network.

When a device wants to communicate with another device on the same network, it needs to know the MAC (Media Access Control) address of the destination device. The ARP protocol is used to map IP addresses to MAC addresses. When a device wants to communicate with another device, it sends an ARP request to the network asking for the MAC address of the target device.

In an ARP poisoning attack, the attacker sends fake ARP messages to other devices on the network, claiming to be the target device with a spoofed MAC address. The attacker can either send a fake ARP message to the target device with the MAC address of the attacker's device, or send a fake ARP message to all devices on the network, pretending to be the gateway or router that connects the devices to the internet.

Once the attacker's fake ARP messages are sent, other devices on the network will update their ARP tables with the fake MAC address. This means that when the devices want to communicate with the target device, they will send their traffic to the attacker's device instead.

The attacker can then intercept, modify or steal the data transmitted between the devices. For example, the attacker can capture login credentials, sensitive information or passwords by sniffing the network traffic. In some cases, the attacker may also modify the traffic to execute man-in-the-middle attacks, such as redirecting a user to a fake website.

To prevent ARP poisoning attacks, it is important to use security measures such as encryption, virtual private networks (VPNs), and network monitoring tools that can detect and block suspicious ARP traffic. Additionally, configuring static ARP entries on critical devices can also help prevent these types of attacks.

# ARP Poisoning between Virtual Machines

This guide will show you how to perform ARP poisoning between two virtual machines, with the victim running Mint and the attacker running Kali.

## Prerequisites

You will need the following tools:

- A victim virtual machine
- An attacker virtual machine
- Ettercap
- Wireshark

## Instructions

### Step 1: Finding the Victim's IP Address

On the victim's Mint virtual machine, open a terminal and type the following command:

```
ifconfig
```

This will display the IP address of the victim machine. Make a note of this IP address, as it will be needed later.

![Alt text](./screenshots/1.jpg?raw=true "Demo")

### Step 1.5: Enable traffic forwarding

Run this command in your terminal to allow your machine to forward all incoming traffic to the real gateway:

```
sudo sysctl net.ipv4.ip_forward=1
```

![Alt text](./screenshots/2.jpg?raw=true "Demo")

### Step 2: Using Ettercap to Perform ARP Poisoning

On the attacker's Kali virtual machine seach for ettercap from the startmenu or open a terminal and type the following command to start ettercap:

```
sudo ettercap -G
```

This will open the graphical interface for ettercap.

In the ettercap interface, choose the network interface that the virtual machines are using (eth0 here) and click the "Accept" button.

![Alt text](./screenshots/3.jpg?raw=true "Demo")

Then, click the "Start / Stop Sniffing" button to perform a unified sniffing.

Next, go to the "Hosts" menu and select "Scan for hosts". This will display a list of all the hosts on the network.

Find the IP address of the victim machine and the router in the list and select them as target 1 and 2 respecively. Then go to the "MITM menu" and select "ARP poisoning...".

![Alt text](./screenshots/4.jpg?raw=true "Demo")

Ettercap will now start sending ARP packets to the victim machine and the router, pretending to be the latter. This will cause the victim's traffic to be redirected through the attacker's machine.

We can check the exploit worked on the victim machine by typing the command :

```
arp -a
```

The MAC address of the attacker should now be linked to the router ip.

![Alt text](./screenshots/5.jpg?raw=true "Demo")

### Step 3: Interception of Traffic on the Attacker Machine Using Wireshark


On the attacker's Kali virtual machine, open Wireshark and start capturing on the network interface that the virtual machines are using.

Filter the capture to show only traffic to and from the victim machine by typing the following filter in the filter box:

```
ip.addr == <victim-ip>
```

Replace `<victim-ip>` with the IP address of the victim machine that you noted in Step 1.

Wireshark will now display all the traffic to and from the victim machine. You can analyze the traffic to see the contents of the packets being sent and received.

The victim tries to login to a HTTP website:

![Alt text](./screenshots/6.jpg?raw=true "Demo")

Let's see what the attacker managed to intercept...

![Alt text](./screenshots/7.jpg?raw=true "Demo")

### Bonus

The victim now tries to login to an HTTPS protected website:

![Alt text](./screenshots/8.jpg?raw=true "Demo")

Let's see the traffic now...

![Alt text](./screenshots/9.jpg?raw=true "Demo")

It's all encrypted ! This is why you should NEVER give informations to a website that does not use HTTPS !

![Alt text](./screenshots/sad_hacker.jpg?raw=true "Demo")

## Conclusion

By following these steps, you have successfully performed ARP poisoning between two virtual machines and intercepted the traffic on the attacker machine using Wireshark. It's important to note that ARP poisoning is a malicious attack and should not be used for any illegal or unauthorized activity. It's also important to only perform ARP poisoning attacks in controlled environments for the purpose of security research or education.
