/***********************************************************/
/*                    Java Networking                      */
/*        2. Two-way client server communication           */
/*                  Server-side program                    */
/***********************************************************/

import java.io.*;
import java.net.*;

class ServerTwoWay{
  public static void main(String args[]){
    try{
      ServerSocket ss = new ServerSocket(9000);
        System.out.println("Server running...");
      Socket s = ss.accept();
        System.out.println("Connected...");
      DataInputStream dis = new DataInputStream(s.getInputStream());
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String srvr = "", clnt = "";

      while(!clnt.equals("QUIT")){
        clnt = dis.readUTF();
        System.out.println("Client: " + clnt);
        System.out.print("Server: ");
        srvr = br.readLine();
        dos.writeUTF(srvr);
      }
      System.out.println("Connection terminated...");
      dis.close();
      dos.close();
      br.close();
      s.close();
      ss.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
