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

### Use Case 2: State Pattern - Vending Machine
### Description
The State Pattern allows an object to change its behavior when its internal state changes. The object will appear to change its class. This example demonstrates a vending machine that behaves differently based on whether a coin has been inserted or not.

### How It Works
**VendingMachineState.java**: is an interface that defines the methods insertCoin and dispenseItem.
**NoCoinState.java** and **HasCoinState.java** are concrete implementations of VendingMachineState.
**NoCoinState:** Represents the state where no coin has been inserted. Only allows coin insertion.
**HasCoinState:** Represents the state where a coin has been inserted. Allows dispensing of an item and resets to NoCoinState after dispensing.
**VendingMachine.java** maintains a reference to the current state. It delegates the actions to the current state and changes its state based on the actions performed.
The main class demonstrates inserting a coin and dispensing an item, showing the state transitions.
### Implementation
**VendingMachineState.java**: Interface defining the state-specific behavior.
**NoCoinState.java:** Class representing the state where no coin has been inserted.
**HasCoinState.java:** Class representing the state where a coin has been inserted.
**VendingMachine.java:** The context class that changes its behavior as its state changes.
**Main.java:** The main class to run the vending machine example.


