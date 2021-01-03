import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class OptionPaneAll extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	OptionPaneAll()
	{
		b1 = new JButton("ONE");
		b1.setBounds(50,50,100,40);
		
		b2 = new JButton("TWO");
		b2.setBounds(100,100,100,40);

		b3 = new JButton("THREE");
		b3.setBounds(150,150,100,40);

		b4= new JButton("FOUR");
		b4.setBounds(200,200,100,40);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this,"HELLO");
		}
		
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(this,"SUCSSESFULLY UPDATED","Alert",JOptionPane.WARNING_MESSAGE);
		}
		if(e.getSource()==b3)
		{
			String name=JOptionPane.showInputDialog(this,"Enter Name");   
		}
		if(e.getSource()==b4)
		{
			JOptionPane.showConfirmDialog(this,"Are you sure?"); 
		}
	}
	public static void main(String args[])
	{
		new OptionPaneAll();
	}
}
		
		
			