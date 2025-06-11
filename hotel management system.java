import java.util.*;

public class HotelManagementSystem {
    private static final int TOTAL_ROOMS = 5;
    private static Room[] rooms = new Room[TOTAL_ROOMS];
    private static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < TOTAL_ROOMS; i++) {
            rooms[i] = new Room(i + 1);
        }

        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("1. View Room Status");
            System.out.println("2. Book Room");
            System.out.println("3. Free Room");
            System.out.println("4. View Customers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    for (Room room : rooms) {
                        System.out.println(room);
                    }
                    break;
                case 2:
                    System.out.print("Enter customer name: ");
                    scanner.nextLine(); // consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter room number to book: ");
                    int roomNum = scanner.nextInt();
                    if (roomNum > 0 && roomNum <= TOTAL_ROOMS && !rooms[roomNum - 1].isBooked()) {
                        rooms[roomNum - 1].bookRoom();
                        customers.add(new Customer(name, roomNum));
                        System.out.println("Room booked successfully.");
                    } else {
                        System.out.println("Room not available.");
                    }
                    break;
                case 3:
                    System.out.print("Enter room number to free: ");
                    int freeRoom = scanner.nextInt();
                    if (freeRoom > 0 && freeRoom <= TOTAL_ROOMS && rooms[freeRoom - 1].isBooked()) {
                        rooms[freeRoom - 1].freeRoom();
                        customers.removeIf(c -> c.getRoomNumber() == freeRoom);
                        System.out.println("Room freed successfully.");
                    } else {
                        System.out.println("Invalid room number or already available.");
                    }
                    break;
                case 4:
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 5:
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
