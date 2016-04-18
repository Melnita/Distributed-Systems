import java.io.*;
import java.net.*;
import java.lang.String;
class TCPClient
{
    public static void main(String[] args) throws IOException
    {
        Socket sock=new Socket("8.9.1.33",3055);
        BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream= sock.getOutputStream();
        PrintWriter pwrite=new PrintWriter(ostream,true);
        InputStream istream= sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader (istream));
        System.out.println("Start chit chatting");
        String receiveMessage,sendMessage;
        while(true)
        {
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            System.out.flush();
            if((receiveMessage=receiveRead.readLine())!=null)
                System.out.println(receiveMessage);
        }
    }
}