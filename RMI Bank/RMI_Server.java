import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class RMI_Server
{
public static void main(String args[])
{
try 
{
//creation of remote class
RMI_Impl implclass=new RMI_Impl();
//bind to registry
Naming.rebind("RMI_INSTANCE",implclass);
}
catch(Exception e)
{
System.out.println("Exception occured" +e);
}
}
}
