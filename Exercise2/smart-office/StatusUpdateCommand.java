public class StatusUpdateCommand implements Command {
    private int roomId;
    private int occupants;

    public StatusUpdateCommand(int roomId, int occupants) {
        this.roomId = roomId;
        this.occupants = occupants;
    }

    @Override
    public void execute() {
        Room room = Office.getInstance().getRoom(roomId);
        if (room != null) {
            room.addOccupants(occupants);
        } else {
            System.out.println("Room " + roomId + " does not exist.");
        }
    }
}
