package day11.LearningThreads.Threads.Basics;

public class MyThreads extends Thread {
    @Override
    public void run() {
        //System.out.println("MyThreads");
//        for (int i = 1; i<=5; i++)
//        {
//            try{
//                Thread.sleep(1000);
//                System.out.println(i+ "I am ");
//            }
//            catch (InterruptedException e){
//                System.out.println(e.getMessage());
//            }
//        }

//        for (int i = 1; i <=3 ; i++) {
//            System.out.println(i);
//
//        }

        for (int i = 1; i <= 3; i++) {
            try{
                Thread.sleep(1000);
                System.out.println(i + "I am new thread");
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }

    }

}
