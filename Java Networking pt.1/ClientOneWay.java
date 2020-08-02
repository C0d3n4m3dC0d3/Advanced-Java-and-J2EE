/***********************************************************/
/*                    Java Networking                      */
/*        1. One-way client server communication           */
/*                  Client-side program                    */
/***********************************************************/

import java.io.*;
import java.net.*;

public class ClientOneWay{
  public static void main(String args[]){
    try{
      Socket s = new Socket("localhost", 6666);
      // Client sends request to Server who is residing in the same machine (hence, localhost)
      // at port number 6666

      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
      // DataOutputStream writes data that can be read by a DataInputStream
      dos.writeUTF("Hello, Server!");
      // Writes message to the OutputStream
      dos.flush();
      // Flushes data from Buffer into the OutputStream
      dos.close();
      //Close the getOutputStream
      s.close();
      //Close the socket
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
