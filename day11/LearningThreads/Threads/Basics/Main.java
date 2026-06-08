package day11.LearningThreads.Threads.Basics;

public class Main {
  public   static void main(String[] args) throws InterruptedException {
      System.out.println("The Creation of Thread");
     MyThreads t=new MyThreads();
      //System.out.println(t.getState());
     t.start();
    //  System.out.println(t.getState());


//      for (int i = 1; i<=5; i++)
//      {
//       try{
//           Thread.sleep(1000);
//           t.join();
//           System.out.println( i + "I am main");
//       }
//       catch (InterruptedException e){
//           System.out.println(e.getMessage());
//       }
//       }

      for (int i = 1; i <=3 ; i++) {
          t.join();
          System.out.println(i);

      }


    }
}
