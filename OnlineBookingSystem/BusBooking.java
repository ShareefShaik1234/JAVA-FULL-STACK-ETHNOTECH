package OnlineBookingSystem;

public class BusBooking extends Booking {

    private String source;
    private String destination;

    public BusBooking(String source, String destination) {

        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public void displayBooking() {
        System.out.println("Bus Booking");
    }
}