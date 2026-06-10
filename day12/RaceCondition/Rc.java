
package day12.RaceCondition;

class MyRace{
    int count;

    public synchronized void increment(){

        //System.out.println("Increment count");
//
//        synchronized (this){
//            count++;
//        }
        count++;

      // System.out.println("Race done");
    }
}
public class Rc {
    public static void main(String[] args) throws InterruptedException {
        MyRace r=new MyRace();

        Thread t1=new Thread(()->{

            for (int i = 1; i <=1000 ; i++) {
                r.increment();

            }
        });

        Thread t2=new Thread(()->{
            for (int i = 1; i <=1000 ; i++) {
                r.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(r.count);



    }
}
