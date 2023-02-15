# ARP Poisoning between Virtual Machines

This guide will show you how to perform ARP poisoning between two virtual machines, with the victim running Mint and the attacker running Kali.

## Prerequisites

You will need the following tools:

- A victim virtual machine=
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

### Step 1.5: Enable traffic forwarding

Run this command in your terminal to allow your machine to forward all incoming traffic to the real gateway:

```
sudo sysctl net.ipv4.ip_forward=1
```

### Step 2: Using Ettercap to Perform ARP Poisoning

On the attacker's Kali virtual machine seach for ettercap from the startmenu or open a terminal and type the following command to start ettercap:

```
sudo ettercap -G
```

This will open the graphical interface for ettercap.

In the ettercap interface, choose the network interface that the virtual machines are using (eth0 here) and click the "Accept" button.

Then, click the "Start / Stop Sniffing" button to perform a unified sniffing.

Next, go to the "Hosts" menu and select "Scan for hosts". This will display a list of all the hosts on the network.

Find the IP address of the victim machine and the router in the list and select them as target 1 and 2 respecively. Then go to the "MITM menu" and select "ARP poisoning...".

Ettercap will now start sending ARP packets to the victim machine and the router, pretending to be the latter. This will cause the victim's traffic to be redirected through the attacker's machine.

We can check the exploit worked on the victim machine by typing the command :

```
arp -a
```

The MAC address of the attacker should now be linked to the router ip.

### Step 3: Interception of Traffic on the Attacker Machine Using Wireshark

On the attacker's Kali virtual machine, open Wireshark and start capturing on the network interface that the virtual machines are using.

Filter the capture to show only traffic to and from the victim machine by typing the following filter in the filter box:

```
ip.addr == <victim-ip>
```

Replace `<victim-ip>` with the IP address of the victim machine that you noted in Step 1.

Wireshark will now display all the traffic to and from the victim machine. You can analyze the traffic to see the contents of the packets being sent and received.

## Conclusion

By following these steps, you have successfully performed ARP poisoning between two virtual machines and intercepted the traffic on the attacker machine using Wireshark. It's important to note that ARP poisoning is a malicious attack and should not be used for any illegal or unauthorized activity. It's also important to only perform ARP poisoning attacks in controlled environments for the purpose of security research or education.