import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingEx3 implements ActionListener{
	JFrame f;
	JButton b;
	JTextField tf;
	SwingEx3(){
		f = new JFrame("Hello");
		tf = new JTextField();
		tf.setBounds(10, 25,100,50);
		b = new JButton("Click Here");
		b.setBounds(10, 100, 100, 50);
		b.addActionListener(this);
		f.add(tf);
		f.add(b);
		f.setLayout(new BorderLayout());
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("Welcome to Java");
	}

	public static void main(String args[]){
		SwingEx3 sw = new SwingEx3();
	}
}
