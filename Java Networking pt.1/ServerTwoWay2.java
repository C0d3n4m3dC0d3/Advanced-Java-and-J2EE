/***********************************************************/
/*                    Java Networking                      */
/*        3. Two-way client server communication           */
/*                 with additional stuff.                  */
/*                  server-side program                    */
/***********************************************************/

import java.io.*;
import java.net.*;

class ServerTwoWay2{
  public static void main(String args[]){
    try{
      System.out.println("Server running...");
      ServerSocket ss = new ServerSocket(9000);
      Socket s = ss.accept();
      System.out.println("Connected...");

      DataInputStream dis = new DataInputStream(s.getInputStream());
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      Integer res = 0, val;
      String srvr = "", clnt = "";

      while(!clnt.equals("QUIT")){
       clnt = dis.readUTF();
    	 System.out.println("Client: " + clnt);
        if(clnt.equals("ADD")){
         srvr = "ENTER";
         System.out.println("Server: " + srvr);
         dos.writeUTF(srvr);
         for(int i = 0; i<2; i++){
          val = dis.readInt();
          System.out.println("Client: " + val);
          res+=val; }
          System.out.println("Server: " + res);
          dos.writeInt(res); }
        else{
         System.out.print("Server: ");
         srvr = br.readLine();
         dos.writeUTF(srvr);}
      }
      System.out.println("Connection terminated...");
    }catch(Exception e){
      System.out.println(e); }
  }
}
