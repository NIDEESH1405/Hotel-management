public class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        this.isBooked = true;
    }

    public void freeRoom() {
        this.isBooked = false;
    }

    public String toString() {
        return "Room " + roomNumber + ": " + (isBooked ? "Booked" : "Available");
    }
}
