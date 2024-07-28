// RemoteControl.java
class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void on() {
        device.on();
    }

    public void off() {
        device.off();
    }
}

// Device.java
interface Device {
    void on();
    void off();
}

// TV.java
class TV implements Device {
    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }
}

// Radio.java
class Radio implements Device {
    public void on() {
        System.out.println("Radio is on");
    }

    public void off() {
        System.out.println("Radio is off");
    }
}

// Main.java
public class Device_main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl remote = new RemoteControl(tv);
        remote.on();
        remote.off();

        remote = new RemoteControl(radio);
        remote.on();
        remote.off();
    }
}
