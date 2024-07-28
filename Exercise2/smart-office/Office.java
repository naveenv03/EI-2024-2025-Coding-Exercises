import java.util.ArrayList;
import java.util.List;

public class Office {
    private static Office instance;
    private List<Room> rooms;

    private Office() {
        rooms = new ArrayList<>();
    }

    public static Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public void configureRooms(int count) {
        rooms.clear();
        for (int i = 1; i <= count; i++) {
            rooms.add(new Room(i));
        }
        System.out.println("Office configured with " + count + " meeting rooms.");
    }

    public Room getRoom(int roomId) {
        for (Room room : rooms) {
            if (room.getRoomId() == roomId) {
                return room;
            }
        }
        return null;
    }
}
