import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class RMI_Client
{
public static void main(String args [])
{
int a=10,b=20;
if (args.length!=1)
{
System.out.println("Usage:java RMI_Client 8.8.1.14");
System.exit(0);
}
String serverName=args[0];
try
{
//lookup
RMI_Interface myserverobject=(RMI_Interface)
Naming.lookup("rmi://"+serverName+"/RMI_INSTANCE");//remote method invocation
int result=myserverobject.add(a,b);
System.out.println("Result of addition is:"+result);
}

catch(Exception e)
{
System.out.println("Exception Occured" +e);
System.exit(0);

}
System.out.println("RMI Connection Successful");
}
}

