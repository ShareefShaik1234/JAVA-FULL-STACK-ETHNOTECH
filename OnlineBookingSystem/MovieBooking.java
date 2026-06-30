package OnlineBookingSystem;

public class MovieBooking extends Booking {

    private String movieName;
    private int seats;

    public MovieBooking(String movieName, int seats) {
        this.movieName = movieName;
        this.seats = seats;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void displayBooking() {
        System.out.println("Movie Booking");
    }
}