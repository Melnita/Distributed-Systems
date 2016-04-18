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
public class TestThreadMulti {
    
   public static void main(String args[]) {
   
      ThreadDemoMulti T1 = new ThreadDemoMulti( "Client1");
      T1.start();
      
      ThreadDemoMulti T2 = new ThreadDemoMulti( "Client2");
      T2.start();
  
}
}
