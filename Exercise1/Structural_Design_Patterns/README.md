**Structural Design Patterns in Java**
This project demonstrates the implementation of two structural design patterns in Java: the Bridge Pattern and the Proxy Pattern. Each pattern is illustrated with a unique use case to showcase its practical application.

**1. Bridge Pattern - Remote-Controlled Devices**
**Overview**
The Bridge Pattern decouples an abstraction from its implementation so that the two can vary independently. In this example, we have a remote control that can operate various devices (like TV and Radio) without being tightly coupled to their implementations.

**Classes and Interfaces**
**Device (Interface):** An interface that defines the basic operations (on and off) for any device.
**TV (Class):** A class that implements the Device interface to represent a TV.
**Radio (Class):** A class that implements the Device interface to represent a Radio.
**RemoteControl (Class):** A class that uses the Device interface to control a device. It can turn the device on and off.
**Usage**
Create instances of TV and Radio.
Use the RemoteControl to control these devices by turning them on and off.


**2. Proxy Pattern - Image Viewer**
**Overview**
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. In this example, we have an image viewer that uses a proxy to load and display images on demand.

**Classes and Interfaces**
**Image (Interface):** An interface that defines the display method for images.
**RealImage (Class):** A class that implements the Image interface and loads an image from disk.
**ProxyImage (Class)**: A class that implements the Image interface and controls access to a RealImage object. It loads the image from disk only when it is first displayed.
**Usage**
Create an instance of ProxyImage with the filename of the image.
Call the display method on the ProxyImage instance to load and display the image. Subsequent calls to display will only display the image without loading it again.
