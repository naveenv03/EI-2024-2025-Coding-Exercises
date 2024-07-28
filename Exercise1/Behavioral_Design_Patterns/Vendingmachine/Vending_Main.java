// VendingMachineState.java
interface VendingMachineState {
    void insertCoin(VendingMachine machine);
    void dispenseItem(VendingMachine machine);
}

// NoCoinState.java
class NoCoinState implements VendingMachineState {
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted");
        machine.setState(new HasCoinState());
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coin first");
    }
}

// HasCoinState.java
class HasCoinState implements VendingMachineState {
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed");
        machine.setState(new NoCoinState());
    }
}

// VendingMachine.java
class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
        state = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }
}

// Main.java
public class Vending_Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.insertCoin();
        machine.dispenseItem();
    }
}
