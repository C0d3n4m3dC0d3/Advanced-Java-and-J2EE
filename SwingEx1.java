
import java.awt.*;
import javax.swing.*;

class SwingEx1{
	JFrame f;
	JButton b;
	SwingEx1(){
		f = new JFrame("Hello");
		b = new JButton("Click here!");
		f.add(b);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]){
		SwingEx1 sw = new SwingEx1();
	}
}
