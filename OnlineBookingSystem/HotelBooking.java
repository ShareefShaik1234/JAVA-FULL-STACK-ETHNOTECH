package OnlineBookingSystem;

public class HotelBooking extends Booking {

    private String hotelName;
    private int rooms;

    public HotelBooking(String hotelName, int rooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRooms() {
        return rooms;
    }

    @Override
    public void displayBooking() {
        System.out.println("Hotel Booking");
    }
}