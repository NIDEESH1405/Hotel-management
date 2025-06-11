public class Customer {
    private String name;
    private int roomNumber;

    public Customer(String name, int roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String toString() {
        return "Customer: " + name + ", Room: " + roomNumber;
    }
}
