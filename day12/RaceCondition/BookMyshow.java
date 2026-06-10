package day12.RaceCondition;

class Book {
    int seat = 2;

    public synchronized void booking(String name) {
        if (seat >= 1) {
            System.out.println(name + " booked 1 seat");
            seat--;
            System.out.println("Remaining seats: " + seat);
        } else {
            System.out.println(name + " : No seats available");
        }
    }
}

class User extends Thread {
    Book b;

    User(Book b, String name) {
        this.b = b;
        setName(name);
    }

    public void run() {
        b.booking(getName());
    }
}

public class BookMyshow {
    public static void main(String[] args) throws InterruptedException {

        Book b = new Book();

        User t1 = new User(b, "Shareef");
        User t2 = new User(b, "Ahmed");
        User t3 = new User(b, "Ravi");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}