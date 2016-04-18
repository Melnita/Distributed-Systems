/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vulture047
 */
public class BmiClient {
    public static void main(String[] args) throws NotBoundException { 
        try { 
            Bmi b = (Bmi)
                           Naming.lookup("rmi://localhost/CalculatorService"); 
                                                // Returns the remote object for the URL. 
            System.out.println( b.calc(56.25, 63) ); // Calls the calc method

}       catch (RemoteException ex) {
            Logger.getLogger(BmiClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(BmiClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
