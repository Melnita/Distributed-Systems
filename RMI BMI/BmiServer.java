/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.rmi.Naming;
/**
 *
 * @author Vulture047
 */
public class BmiServer {

   public BmiServer() {
     try {
       Bmi b = new BmiImpl();
       Naming.rebind("rmi://localhost:1099/CalculatorService", b); //Rebind the name to a new object replaces any existing binding. 
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

    /**
     *
     * @param args
     */
    public static void main(String [] args){
    
       new BmiServer();
   }
}

