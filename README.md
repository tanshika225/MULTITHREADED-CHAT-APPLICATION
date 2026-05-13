# MULTITHREADED-CHAT-APPLICATION
COMPANY: CODTECH IT SOLUTIONS

NAME: TANSHIKA J S

INTERN ID: CTIS8691

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTHOSH

# PROJECT DESCRIPTION
# Java Multithreaded Chat Application – Project Description

The Java Multithreaded Chat Application is a client-server based networking project developed using the Java programming language. The main objective of this project is to enable multiple users to communicate with each other simultaneously through a common server using socket programming and multithreading concepts. This project demonstrates real-time communication between clients and provides practical exposure to networking, concurrent programming, and input/output stream handling in Java.

The project was developed using the Eclipse IDE platform, which provides an integrated environment for writing, compiling, debugging, and executing Java applications efficiently. The programming language used in this project is Java, and the project runs on the Java Virtual Machine (JVM), making it platform-independent.

# Technologies and Tools Used
1. Programming Language
Java
2. IDE / Editor
Eclipse IDE
3. Concepts Used
Socket Programming
Multithreading
Client-Server Architecture
Exception Handling
Input/Output Streams
Collections Framework (HashSet)
4. Platform
Windows Operating System
Java Development Kit (JDK)
Project Modules

# The project consists of three main Java files:

1. Server.java

The Server.java file acts as the central server of the chat system. It creates a ServerSocket on a fixed port number and continuously waits for clients to connect. Whenever a new client joins, the server accepts the connection and creates a separate thread for handling that client independently. This allows multiple users to communicate simultaneously without interrupting each other.

The server also maintains a collection of active clients using the HashSet collection. When one client sends a message, the server broadcasts that message to all other connected clients.

2. ClientHandler.java

The ClientHandler.java file is responsible for managing communication between the server and an individual client. Each connected client gets a dedicated thread through the Runnable interface. The handler receives messages from the client and forwards them to the server for broadcasting.

This class also handles:

Reading client messages
Sending messages to other clients
Managing client disconnections
Closing sockets properly

The use of multithreading ensures that multiple users can send and receive messages at the same time without delays.

3. Client.java

The Client.java file represents the user side of the application. It connects to the server using the server’s IP address and port number. Once connected, the client can send messages and also receive messages from other users.

A separate thread is created in the client application to continuously listen for incoming messages from the server while the user types messages simultaneously. This creates a smooth real-time chat experience.

# Working of the Project
The server application is started first.
The server waits for client connections on a predefined port.
Multiple clients can connect to the server simultaneously.
Each client enters their name after connecting.
Messages typed by one client are sent to the server.
The server broadcasts the message to all connected clients except the sender.
If any client disconnects, the server removes that client from the active client list.
Features of the Project
Real-time communication
Multiple client support
Multithreaded architecture
Simple and user-friendly console interface
Automatic message broadcasting
Client connection and disconnection handling
Platform-independent execution
Applications of the Project

# This type of chat application has several real-world applications in communication systems and collaborative environments. Some practical uses include:

Online chatting systems
Group communication platforms
Customer support systems
Team collaboration tools
Classroom communication systems
Gaming chat rooms
Corporate internal communication systems

# The project also serves as a strong foundation for developing advanced applications such as:

GUI-based chat applications
Secure encrypted messaging systems
Video conferencing software
WebSocket-based web chat applications
Cloud-based messaging platforms
Learning Outcomes

# Through this project, important programming concepts and practical skills are learned, including:

Network communication using sockets
Concurrent programming using threads
Server-client interaction
Real-time data transmission
Exception handling in networking
Java stream handling
Resource management
