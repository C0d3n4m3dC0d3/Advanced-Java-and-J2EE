/***********************************************************/
/*                    Java Networking                      */
/*        2. Two-way client server communication           */
/*                  Client-side program                    */
/***********************************************************/

import java.io.*;
import java.net.*;

class ClientTwoWay{
  public static void main(String args[]){
    try{
      System.out.println("Establishing connection...");
      Socket s = new Socket("localhost", 9000);
        System.out.println("Connected...");

      DataInputStream dis = new DataInputStream(s.getInputStream());
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String srvr = " ", clnt = " ";

      while(!clnt.equals("QUIT")){
        System.out.print("Client: ");
        clnt = br.readLine();
        dos.writeUTF(clnt);
        srvr = dis.readUTF();
        System.out.println("Server: " + srvr);
      }

      System.out.println("Connection terminated...");

      dis.close();
      dos.close();
      br.close();
      s.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
