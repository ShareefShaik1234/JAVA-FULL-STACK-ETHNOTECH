package OnlineBookingSystem;

import java.util.Scanner;
import java.sql.*;


public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== ONLINE BOOKING SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    register(sc);
                    break;
                case 2:
                    User user = login(sc);

                    if (user != null) {

                        System.out.println("\n========================");
                        System.out.println("Login Successful");
                        System.out.println("Welcome Back " + user.getUsername());
                        System.out.println("========================");

                        userDashboard(user, sc);

                    } else {

                        System.out.println("Invalid Username or Password");
                    }
                    break;

                case 3:
                    adminLogin(sc);
                    break;

                case 4:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void register(Scanner sc) {

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            // Check if username already exists
            String checkQuery =
                    "SELECT * FROM users WHERE username=?";

            PreparedStatement checkPs =
                    con.prepareStatement(checkQuery);

            checkPs.setString(1, username);

            ResultSet rs = checkPs.executeQuery();

            if(rs.next()) {
                System.out.println("Username Already Exists");
                return;
            }

            // Insert new user
            String query =
                    "INSERT INTO users(username,password) VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ps.executeUpdate();

            System.out.println("\n========================");
            System.out.println("Registration Successful");
            System.out.println("Welcome " + username);
            System.out.println("========================");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User login(Scanner sc) {

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new User(
                        rs.getString("username"),
                        rs.getString("password")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void viewUsers() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM users";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("\nRegistered Users:");

            int count = 1;

            while(rs.next()) {

                System.out.println(
                        count++ + ". " +
                                rs.getString("username")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void userDashboard(User user, Scanner sc) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("        USER DASHBOARD");
            System.out.println("=================================");
            System.out.println("Welcome, " + user.getUsername());
            System.out.println("---------------------------------");
            System.out.println("1. Movie Booking");
            System.out.println("2. Bus Booking");
            System.out.println("3. Train Booking");
            System.out.println("4. Hotel Booking");
            System.out.println("5. Logout");
            System.out.println("---------------------------------");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    movieMenu(sc);
                    break;

                case 2:
                    busMenu(sc);
                    break;

                case 3:
                    trainMenu(sc);
                    break;


                case 4:
                    hotelMenu(sc);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void movieMenu(Scanner sc) {

        while(true) {

            System.out.println("\n=================================");
            System.out.println("        MOVIE BOOKING");
            System.out.println("=================================");
            System.out.println("1. Book Movie");
            System.out.println("2. View Movie Bookings");
            System.out.println("3. Cancel Movie Booking");
            System.out.println("4. Back");
            System.out.println("---------------------------------");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    bookMovie(sc);
                    break;

                case 2:
                    viewMovieBookings();
                    break;

                case 3:
                    cancelMovie(sc);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void busMenu(Scanner sc) {

        while(true) {

            System.out.println("\n=================================");
            System.out.println("         BUS BOOKING");
            System.out.println("=================================");
            System.out.println("1. Book Bus");
            System.out.println("2. View Bus Bookings");
            System.out.println("3. Cancel Bus Booking");
            System.out.println("4. Back");
            System.out.println("---------------------------------");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    bookBus(sc);
                    break;

                case 2:
                    viewBusBookings();
                    break;

                case 3:
                    cancelBus(sc);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void trainMenu(Scanner sc) {

        while(true) {

            System.out.println("\n=================================");
            System.out.println("       TRAIN BOOKING");
            System.out.println("=================================");
            System.out.println("1. Book Train");
            System.out.println("2. View Train Bookings");
            System.out.println("3. Cancel Train Booking");
            System.out.println("4. Back");
            System.out.println("---------------------------------");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    bookTrain(sc);
                    break;

                case 2:
                    viewTrainBookings();
                    break;

                case 3:
                    cancelTrain(sc);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }



    public static void hotelMenu(Scanner sc) {

        while(true) {

            System.out.println("\n=================================");
            System.out.println("       HOTEL BOOKING");
            System.out.println("=================================");
            System.out.println("1. Book Hotel");
            System.out.println("2. View Hotel Bookings");
            System.out.println("3. Cancel Hotel Booking");
            System.out.println("4. Back");
            System.out.println("---------------------------------");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    bookHotel(sc);
                    break;

                case 2:
                    viewHotelBookings();
                    break;

                case 3:
                    cancelHotel(sc);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }



    public static void bookMovie(Scanner sc) {
        System.out.print("Movie Name: ");
        String movie = sc.next();
        System.out.print("Seats: ");
        int seats = sc.nextInt();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO movie_bookings(movie_name,seats) VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, movie);
            ps.setInt(2, seats);

            ps.executeUpdate();

            System.out.println("\n========================");
            System.out.println("BOOKING CONFIRMED");
            System.out.println("Movie : " + movie);
            System.out.println("Seats : " + seats);
            System.out.println("========================");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewMovieBookings() {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "SELECT * FROM movie_bookings";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getString("movie_name")
                                + " Seats: "
                                + rs.getInt("seats")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancelMovie(Scanner sc) {

        System.out.print("Movie Name: ");
        String movie = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "DELETE FROM movie_bookings WHERE movie_name=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, movie);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Movie Cancelled");
            }
            else {
                System.out.println("Movie Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void bookBus(Scanner sc) {
        System.out.print("Source: ");
        String source = sc.next();

        System.out.print("Destination: ");
        String destination = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO bus_bookings(source,destination) VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, source);
            ps.setString(2, destination);

            ps.executeUpdate();

            System.out.println("\n========================");
            System.out.println("BOOKING CONFIRMED");
            System.out.println("Source : " + source);
            System.out.println("Destination : " + destination);
            System.out.println("========================");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewBusBookings() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM bus_bookings";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getString("source")
                                + " -> " +
                                rs.getString("destination")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancelBus(Scanner sc) {

        System.out.print("Source: ");
        String source = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "DELETE FROM bus_bookings WHERE source=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, source);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Bus Booking Cancelled");
            } else {
                System.out.println("Booking Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void bookTrain(Scanner sc) {
        System.out.print("Train Name: ");
        String train = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO train_bookings(train_name) VALUES(?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, train);

            ps.executeUpdate();

            System.out.println("\n========================");
            System.out.println("BOOKING CONFIRMED");
            System.out.println("Train : " + train);
            System.out.println("========================");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewTrainBookings() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM train_bookings";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getString("train_name")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancelTrain(Scanner sc) {

        System.out.print("Train Name: ");
        String train = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "DELETE FROM train_bookings WHERE train_name=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, train);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Train Booking Cancelled");
            } else {
                System.out.println("Booking Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void bookHotel(Scanner sc) {
        System.out.print("Hotel Name: ");
        String hotel = sc.next();

        System.out.print("Rooms: ");
        int rooms = sc.nextInt();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO hotel_bookings(hotel_name,rooms) VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, hotel);
            ps.setInt(2, rooms);

            ps.executeUpdate();

            System.out.println("\n========================");
            System.out.println("BOOKING CONFIRMED");
            System.out.println("Hotel : " + hotel);
            System.out.println("Rooms : " + rooms);
            System.out.println("========================");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewHotelBookings() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM hotel_bookings";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getString("hotel_name")
                                + " Rooms: "
                                + rs.getInt("rooms")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancelHotel(Scanner sc) {

        System.out.print("Hotel Name: ");
        String hotel = sc.next();

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "DELETE FROM hotel_bookings WHERE hotel_name=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, hotel);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Hotel Booking Cancelled");
            } else {
                System.out.println("Booking Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void adminLogin(Scanner sc) {

        System.out.println("\n========================");
        System.out.println("      ADMIN LOGIN");
        System.out.println("========================");

        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        if(username.equals("admin")
                && password.equals("admin123")) {

            System.out.println("\n========================");
            System.out.println("Admin Login Successful");
            System.out.println("Welcome Admin");
            System.out.println("========================");

            adminDashboard(sc);

        } else {

            System.out.println("Invalid Admin Credentials");
        }
    }
    public static void adminDashboard(Scanner sc) {

        while(true) {

            System.out.println("\n===== ADMIN PANEL =====");

            System.out.println("1. View Users");
            System.out.println("2. View Movie Bookings");
            System.out.println("3. View Bus Bookings");
            System.out.println("4. View Train Bookings");
            System.out.println("5. View Hotel Bookings");
            System.out.println("6. View Statistics");
            System.out.println("7. View All Bookings");
            System.out.println("8. Logout");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    viewUsers();
                    break;

                case 2:
                    viewMovieBookings();
                    break;

                case 3:
                    viewBusBookings();
                    break;

                case 4:
                    viewTrainBookings();
                    break;


                case 5:
                    viewHotelBookings();
                    break;

                case 6:
                    bookingStatistics();
                    break;

                case 7:
                    viewAllBookings();
                    break;

                case 8:
                    return;



                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    public static void bookingStatistics() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs1 =
                    st.executeQuery("SELECT COUNT(*) FROM users");

            rs1.next();
            int users = rs1.getInt(1);

            ResultSet rs2 =
                    st.executeQuery("SELECT COUNT(*) FROM movie_bookings");

            rs2.next();
            int movies = rs2.getInt(1);

            ResultSet rs3 =
                    st.executeQuery("SELECT COUNT(*) FROM bus_bookings");

            rs3.next();
            int buses = rs3.getInt(1);

            ResultSet rs4 =
                    st.executeQuery("SELECT COUNT(*) FROM train_bookings");

            rs4.next();
            int trains = rs4.getInt(1);

            ResultSet rs5 =
                    st.executeQuery("SELECT COUNT(*) FROM hotel_bookings");

            rs5.next();
            int hotels = rs5.getInt(1);

            System.out.println("\n===== SYSTEM STATISTICS =====");

            System.out.println("Total Users : " + users);
            System.out.println("Movie Bookings : " + movies);
            System.out.println("Bus Bookings : " + buses);
            System.out.println("Train Bookings : " + trains);
            System.out.println("Hotel Bookings : " + hotels);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void viewAllBookings() {

        System.out.println("\n===== MOVIE BOOKINGS =====");
        viewMovieBookings();

        System.out.println("\n===== BUS BOOKINGS =====");
        viewBusBookings();

        System.out.println("\n===== TRAIN BOOKINGS =====");
        viewTrainBookings();

        System.out.println("\n===== HOTEL BOOKINGS =====");
        viewHotelBookings();
    }
}