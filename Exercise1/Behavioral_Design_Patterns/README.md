# Behavioral Design Patterns in Java

## Overview
This repository contains two use cases demonstrating behavioral design patterns in Java:
1. **Mediator Pattern** - Implemented through a Chat Room example.
2. **State Pattern** - Implemented through a Vending Machine example.

## Use Case 1: Mediator Pattern - Chat Room

### How It Works
1. **ChatRoom.java** acts as the mediator. It keeps a list of users and handles the broadcasting of messages.
2. **User.java** represents a participant in the chat room. Each user has a reference to the chat room and can send messages through it.
3. When a user sends a message, the `ChatRoom`'s `showMessage` method is called, which prints the message to the console along with the user's name.
   
### Description
The Mediator Pattern is used to reduce the complexity of communication between multiple objects. Instead of having objects refer to each other explicitly, they communicate through a mediator object. This example showcases a simple chat room where users can send messages to each other through a central `ChatRoom` mediator.

### Implementation
- **ChatRoom.java**: The mediator class that handles the communication between users.
- **User.java**: Represents a user in the chat room.
- **Main.java**: The main class to run the chat room example.


