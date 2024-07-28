public class CancelCommand implements Command {
    private int roomId;

    public CancelCommand(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public void execute() {
        Room room = Office.getInstance().getRoom(roomId);
        if (room != null) {
            room.cancelBooking();
        } else {
            System.out.println("Room " + roomId + " does not exist.");
        }
    }
}
