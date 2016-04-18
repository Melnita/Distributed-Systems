/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.Scanner;

/**
 *
 * @author Vulture047
 */
public class Berkley {
    public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the time at server in hr and min"); // Getting server time
 Server s=new Server();
 s.setTime(sc.nextInt(),sc.nextInt());
 System.out.println("Enter no. of clients");
 int n=sc.nextInt();
 Client c[]=new Client[n];// number of clients are created
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter time for Client "+(i+1)); // Getting Client time
 c[i]=new Client();
 c[i].setTime(sc.nextInt(), sc.nextInt());
 }
 System.out.println("Server askin for the time to all the clients");
 for(int i=0;i<n;i++)
 {
 System.out.println("Client "+(i+1)+" time is "+c[i].getHr()+"hr "+c[i].getMin()+"min");
 }
 int timeMinsServer=convertToMins(s);
 int timeMinsClients[]=new int[n];
 for(int i=0;i<n;i++)
 {
 timeMinsClients[i]=convertToMins(c[i]);
 }
                                   //finding mean
 int sumOfTime=timeMinsServer;
 for(int i=0;i<n;i++)
 sumOfTime+=timeMinsClients[i];
 int mean=sumOfTime/(n+1);
                                 //convert time to hrs and mins
 int hr=mean/60;
 int min=mean%60;
 System.out.println("Setting the time for server and client");
 s.setTime(hr, min);
 System.out.println("Server Time "+s.getHr()+"hr "+s.getMin()+"min");
 for(int i=0;i<n;i++)
 {
 c[i].setTime(hr, min);

 System.out.println("Client "+(i+1)+" Time is "+s.getHr()+"hr "+s.getMin()+"min");
 }
 }
 private static int convertToMins(Server s) {
 return ((s.getHr()*60)+s.getMin());
 }
 private static int convertToMins(Client s) {
 return ((s.getHr()*60)+s.getMin());
 }
 }
class Client
{
 int hr;
 int min;
 void setTime(int hrget,int minget) {
 hr=hrget;
 min=minget;
 }
 int getHr()
 {
 return hr;
 }
 int getMin()
 {
 return min;
 }
 }
class Server
{
 int hr;
 int min;
 void setTime(int hrget,int minget) {
 hr=hrget;
 min=minget;
 }
 int getHr()
 {
 return hr;
 }
 int getMin()
 {
 return min;
 }

    
}
