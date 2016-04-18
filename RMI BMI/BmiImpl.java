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
public class BmiImpl extends java.rmi.server.UnicastRemoteObject implements Bmi { 
    
    public BmiImpl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public double calc(double a, double b) 
        throws java.rmi.RemoteException { 
        System.out.println ("Calculating BMI");
        b=b*0.025;
        b=b*b;
        double k=(a/b);
        return k; 
    } 
}
