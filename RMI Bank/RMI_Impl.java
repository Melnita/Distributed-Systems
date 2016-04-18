import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class RMI_Impl extends UnicastRemoteObject implements RMI_Interface
{
public RMI_Impl() throws RemoteException
{
}
public int add(int i,int j)
{
return(i+j);

}
}
