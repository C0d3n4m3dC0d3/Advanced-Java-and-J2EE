/***********************************************************/
/*                    Java Networking                      */
/*        1. One-way client server communication           */
/*                  Server-side program                    */
/***********************************************************/

import java.io.*;
import java.net.*;

public class ServerOneWay{
  public static void main(String args[]){
    try{
      ServerSocket ss = new ServerSocket(6666); // Server opened at port 6666
      Socket s = ss.accept(); //If client object sends request, connection is established.
                              //else, the server waits for request

      DataInputStream dis = new DataInputStream(s.getInputStream());
      //DataInputStream is used to read primitive data; it is machine-independent
      String str = dis.readUTF();
      // readUTF() is a DataInputStream method, used to read String data
      System.out.println("Client: " + str);
      // Prints the message sent by Client
      ss.close();
      //Closes the connection
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
