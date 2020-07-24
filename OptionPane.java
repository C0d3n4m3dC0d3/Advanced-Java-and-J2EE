import javax.swing.*;
public class OptionPane{
 JFrame f;
 OptionPane(){
	f = new JFrame();
	JOptionPane.showMessageDialog(f, "Hello, Welcome to Message Dialog.");
 }
 public static void main(String args[]){
	 new OptionPane();
 }
}
