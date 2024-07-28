Use Case 2: State Pattern - Vending Machine
Description
The State Pattern allows an object to change its behavior when its internal state changes. The object will appear to change its class. This example demonstrates a vending machine that behaves differently based on whether a coin has been inserted or not.

How It Works
The VendingMachine class maintains a reference to an instance of a VendingMachineState, which defines its current state. Depending on whether the state is NoCoinState or HasCoinState, the behavior of insertCoin and dispenseItem methods changes. The state transitions are managed by setting a new state in the VendingMachine class.

Implementation
VendingMachineState.java: Interface defining the state-specific behavior.
NoCoinState.java: Class representing the state where no coin has been inserted.
HasCoinState.java: Class representing the state where a coin has been inserted.
VendingMachine.java: The context class that changes its behavior as its state changes.
Main.java: The main class to run the vending machine example.
