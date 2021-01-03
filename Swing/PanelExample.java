import java.awt.*;  
import javax.swing.*;  
public class PanelExample {  
     PanelExample()  
        {  
        JFrame f= new JFrame("Panel Example");    
        JPanel panel1=new JPanel();  
	JPanel panel2=new JPanel();  
        panel1.setBackground(Color.gray);  
	panel2.setBackground(Color.orange);  
        JButton b1=new JButton("Button 1");     
        b1.setBounds(50,100,80,30);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton("Button 2");   
        b2.setBounds(100,100,80,30);    
        b2.setBackground(Color.green); 
	JButton b3=new JButton("Button 3");     
        b3.setBounds(50,100,80,30);    
        b3.setBackground(Color.yellow);   
        JButton b4=new JButton("Button 4");   
        b4.setBounds(100,100,80,30);    
        b4.setBackground(Color.green);  
        panel1.add(b1); panel1.add(b2);  
	panel2.add(b3);panel2.add(b4);
		f.setLayout(new BorderLayout()); 
	        f.add(panel1,BorderLayout.NORTH);  
		f.add(panel2,BorderLayout.SOUTH);
                f.setSize(400,400);    
                f.setVisible(true);  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        }  
        public static void main(String args[])  
        {  
        new PanelExample();  
        }  
    }  