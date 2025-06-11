public class Billing {
    private int roomRate;
    private int nights;

    public Billing(int roomRate, int nights) {
        this.roomRate = roomRate;
        this.nights = nights;
    }

    public int calculateBill() {
        return roomRate * nights;
    }
}
