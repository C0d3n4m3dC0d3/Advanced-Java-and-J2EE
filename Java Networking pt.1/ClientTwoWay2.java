/***********************************************************/
/*                    Java Networking                      */
/*        3. Two-way client server communication           */
/*                 with additional stuff.                  */
/*                  client-side program                    */
/***********************************************************/

import java.io.*;
import java.net.*;

class ClientTwoWay2{
  public static void main(String args[]){
    try{
      System.out.println("Establishing connection...");
      Socket s = new Socket("localhost", 9000);
        System.out.println("Connected...");

      DataInputStream dis = new DataInputStream(s.getInputStream());
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String clnt = "", srvr = "";
      int val, res;

      while(!clnt.equals("QUIT")){
        System.out.print("Client: ");
        clnt = br.readLine();
          dos.writeUTF(clnt);
        srvr = dis.readUTF();
          System.out.println("Server: "  + srvr);
        if(srvr.equals("ENTER")){
          for(int i = 0; i<2; i++){
            System.out.print("Client: ");
            val = Integer.parseInt(br.readLine());
            dos.writeInt(val); }
          res = dis.readInt();
          System.out.println("Server: " + res);
        }
      }
      System.out.println("Connection terminated...");
    }catch(Exception e){

    }
  }
}
