/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author Vulture047
 */
class ThreadDemoMulti extends Thread {
   private Thread t;
   private String threadName;
   private int mutex=0;
  private String txt[]={"Bye","Fine","How are you?","Hi"};
   ThreadDemoMulti( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 3; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + txt[i]);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
      
     System.out.println("Thread " +  threadName + " exiting.");
   }
   
  
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
         
      }
      
	   }
   

}


