# Smart Office Facility Management System

## Overview

The Smart Office Facility Management System is a console-based application designed to manage conference room bookings, occupancy detection, and automate the control of air conditioning and lighting based on room occupancy. The system uses various design patterns such as Singleton, Observer, and Command patterns to ensure an efficient, maintainable, and scalable solution.

## Features

### Mandatory Requirements
- **Configure Office Facility**: Users can specify the number of meeting rooms.
- **Book and Cancel Bookings**: Users can book and cancel bookings for conference rooms.
- **Occupancy Detection**: The system detects occupancy using sensors that register when at least two people enter a room.
- **Automatic Release of Unoccupied Rooms**: Unoccupied rooms release bookings automatically if not occupied within 5 minutes.
- **Automated Control of AC and Lights**: The air conditioning and lights turn off if the room is not occupied.

## Design Patterns Used
- **Singleton Pattern**: Ensures that the office configuration and room booking system is a single instance throughout the application.
- **Observer Pattern**: Implements sensors and control systems (lights, AC) as observers to the room's occupancy status.
- **Command Pattern**: Handles booking, cancellation, and room status updates through commands, allowing for flexible and extendable operations.

## Class Structure

### Office.java
- Manages the global state of the office configuration.
- Ensures only one instance of the office configuration exists.
- Allows configuration of rooms and retrieval of specific room details.

### Room.java
- Represents a meeting room with attributes such as room ID, maximum capacity, current occupants, booking status, and occupancy status.
- Manages room booking, cancellation, and occupancy detection.
- Controls the state of air conditioning and lighting based on room occupancy.

### Command.java
- An interface representing a command with an `execute` method.

### BookingCommand.java
- Implements the `Command` interface for booking a room.

### CancelCommand.java
- Implements the `Command` interface for canceling a booking.

### StatusUpdateCommand.java
- Implements the `Command` interface for updating the occupancy status of a room.

### SmartOfficeFacility.java
- The main class that provides a user interface for interacting with the system.
- Allows users to configure rooms, set room capacity, add occupants, book rooms, cancel bookings, and exit the application.
