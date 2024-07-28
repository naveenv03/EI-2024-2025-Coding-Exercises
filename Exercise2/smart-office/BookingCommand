public class BookingCommand implements Command {
    private int roomId;
    private String startTime;
    private int duration;

    public BookingCommand(int roomId, String startTime, int duration) {
        this.roomId = roomId;
        this.startTime = startTime;
        this.duration = duration;
    }

    @Override
    public void execute() {
        Room room = Office.getInstance().getRoom(roomId);
        if (room != null) {
            room.bookRoom(startTime, duration);
        } else {
            System.out.println("Room " + roomId + " does not exist.");
        }
    }
}
