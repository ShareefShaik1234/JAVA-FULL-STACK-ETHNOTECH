package OnlineBookingSystem;

public class TrainBooking extends Booking {

    private String trainName;

    public TrainBooking(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }

    @Override
    public void displayBooking() {
        System.out.println("Train Booking");
    }
}