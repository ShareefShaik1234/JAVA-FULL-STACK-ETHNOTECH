package day8.oops;


 abstract class Vehicle{
    void testRide(){
        System.out.println("This is a test");
    }
    abstract void buy();
    abstract void price();
}

class Car extends Vehicle{
     void buy(){
         System.out.println("This is a buy ");
     }
     @Override
     void price(){
         System.out.println("This is the price of a Car");
     }
}
public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.buy();
        car.price();


    }

}
