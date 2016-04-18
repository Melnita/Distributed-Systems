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
public interface Bmi 
          extends java.rmi.Remote { 
    public double calc(double a, double b) 
        throws java.rmi.RemoteException; 
}