import java.util.Timer;
import java.util.TimerTask;

public class Room {
    private int roomId;
    private int maxCapacity;
    private int currentOccupants;
    private boolean isBooked;
    private Timer timer;

    public Room(int roomId) {
        this.roomId = roomId;
        this.maxCapacity = 0;
        this.currentOccupants = 0;
        this.isBooked = false;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setMaxCapacity(int capacity) {
        if (capacity <= 0) {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
        } else {
            this.maxCapacity = capacity;
            System.out.println("Room " + roomId + " maximum capacity set to " + capacity + ".");
        }
    }

    public void addOccupants(int number) {
        if (number < 0) {
            System.out.println("Invalid number of occupants.");
            return;
        }
        this.currentOccupants = number;
        if (this.currentOccupants >= 2) {
            this.isBooked = true;
            turnOn();
        } else {
            this.isBooked = false;
            turnOff();
        }
    }

    private void turnOn() {
        System.out.println("Room " + roomId + " is now occupied by " + currentOccupants + " persons. AC and lights turned on.");
    }

    private void turnOff() {
        System.out.println("Room " + roomId + " is now unoccupied. AC and lights turned off.");
    }

    public void bookRoom(String startTime, int duration) {
        if (isBooked) {
            System.out.println("Room " + roomId + " is already booked during this time. Cannot book.");
        } else {
            this.isBooked = true;
            System.out.println("Room " + roomId + " booked from " + startTime + " for " + duration + " minutes.");
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    releaseBooking();
                }
            }, 5 * 60 * 1000); // 5 minutes in milliseconds
        }
    }

    public void cancelBooking() {
        if (!isBooked) {
            System.out.println("Room " + roomId + " is not booked. Cannot cancel booking.");
        } else {
            this.isBooked = false;
            System.out.println("Booking for Room " + roomId + " cancelled successfully.");
            if (timer != null) {
                timer.cancel();
            }
        }
    }

    private void releaseBooking() {
        this.isBooked = false;
        turnOff();
        System.out.println("Room " + roomId + " is now unoccupied. Booking released. AC and lights off.");
    }
}
