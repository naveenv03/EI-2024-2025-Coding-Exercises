# Creational Design Patterns in Java

## Overview
This repository contains two use cases demonstrating creational design patterns in Java:
1. **Object Pool Pattern** - Implemented through a Connection Pool example.
2. **Builder Pattern** - Implemented through a Meal Builder example.

## Use Case 1: Object Pool Pattern - Connection Pool

### Description
The Object Pool Pattern is used to manage a pool of reusable objects. This pattern is particularly useful for managing expensive-to-create objects. This example demonstrates a connection pool where connections can be acquired and released, promoting efficient resource management.

### How It Works
- **Connection.java**: Represents a connection with methods to connect and disconnect.
- **ConnectionPool.java**: Manages a pool of `Connection` objects. It provides methods to acquire a connection from the pool and release a connection back to the pool.
- **Main.java**: Demonstrates acquiring and releasing connections from the connection pool.

### Implementation
- **Connection.java**: Class representing a connection.
- **ConnectionPool.java**: Class managing a pool of connections.
- **Main.java**: The main class to run the connection pool example.

### Use Case 2: Builder Pattern - Meal Builder
**Description**
The Builder Pattern is used to construct a complex object step by step. This pattern allows for the creation of different representations of an object using the same construction process. This example demonstrates building a meal with different components using a builder.

**How It Works**
Meal.java: Represents a meal consisting of various components.
MealBuilder.java: Abstract class defining the methods to build different parts of a meal.
VegetarianMealBuilder.java: Concrete implementation of MealBuilder to build a vegetarian meal.
Main.java: Demonstrates building a vegetarian meal using the VegetarianMealBuilder.
**Implementation**
Meal.java: Class representing a meal with a list of components.
MealBuilder.java: Abstract class defining the building process for a meal.
VegetarianMealBuilder.java: Concrete implementation of MealBuilder for a vegetarian meal.
Main.java: The main class to run the meal builder example.

