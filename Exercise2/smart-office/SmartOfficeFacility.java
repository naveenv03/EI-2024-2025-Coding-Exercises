import java.util.Scanner;

public class SmartOfficeFacility {

    public static void main(String[] args) {
        Office office = Office.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Configure Rooms");
            System.out.println("2. Set Room Capacity");
            System.out.println("3. Add Occupants");
            System.out.println("4. Book Room");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number of rooms:");
                    int numRooms = scanner.nextInt();
                    office.configureRooms(numRooms);
                    break;
                case 2:
                    System.out.println("Enter room ID:");
                    int roomId = scanner.nextInt();
                    System.out.println("Enter maximum capacity:");
                    int maxCapacity = scanner.nextInt();
                    Room room = office.getRoom(roomId);
                    if (room != null) {
                        room.setMaxCapacity(maxCapacity);
                    } else {
                        System.out.println("Room " + roomId + " does not exist.");
                    }
                    break;
                case 3:
                    System.out.println("Enter room ID:");
                    roomId = scanner.nextInt();
                    System.out.println("Enter number of occupants:");
                    int occupants = scanner.nextInt();
                    Command statusCommand = new StatusUpdateCommand(roomId, occupants);
                    statusCommand.execute();
                    break;
                case 4:
                    System.out.println("Enter room ID:");
                    roomId = scanner.nextInt();
                    System.out.println("Enter start time (HH:mm):");
                    String startTime = scanner.next();
                    System.out.println("Enter duration (minutes):");
                    int duration = scanner.nextInt();
                    Command bookingCommand = new BookingCommand(roomId, startTime, duration);
                    bookingCommand.execute();
                    break;
                case 5:
                    System.out.println("Enter room ID:");
                    roomId = scanner.nextInt();
                    Command cancelCommand = new CancelCommand(roomId);
                    cancelCommand.execute();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
