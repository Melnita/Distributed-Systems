 
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
 
public class CalculatorClient { 
 
    public static void main(String[] args) { 
        try { 
            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService"); 
                                                // Returns the remote object for the URL. 
            System.out.println( c.sub(4, 3) ); // Calls the subtraction method
            System.out.println( c.add(4, 5) ); //Calls the addition method
            System.out.println( c.mul(3, 6) ); // Calls the multiplication method
            System.out.println( c.div(9, 3) ); // Calls the division method
        } 
        catch (MalformedURLException murle) // Constructs a MalformedURLException with the specified detail message { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) // Constructs a RemoteException with the specified detail message { 
            System.out.println(); 
            System.out.println(
                        "RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println(
                       "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException
                                      ae) { 
            System.out.println(); 
            System.out.println(
             "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    } 
} 


