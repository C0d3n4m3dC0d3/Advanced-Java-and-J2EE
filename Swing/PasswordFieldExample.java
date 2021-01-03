import javax.swing.*;
import java.awt.event.*;
class PasswordFieldExample implements ActionListener{
JFrame f;
JLabel label,label1,label2;
JButton b;
JTextField text;
JPasswordField value;
PasswordFieldExample(){
f=new JFrame("Password Field Example");
label=new JLabel();
label.setBounds(20,150,300,150);
value=new JPasswordField();
value.setBounds(100,75,100,30);
label1=new JLabel("Username");
label1.setBounds(20,20,80,30);
label2=new JLabel("Password");
label2.setBounds(20,75,80,30);
b=new JButton("Login");
b.setBounds(100,120,80,30);
text=new JTextField();
text.setBounds(100,20,100,30);
f.add(value);f.add(label1);f.add(label);f.add(label2);f.add(b);f.add(text);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
String data="Username : "+text.getText();
data +=", Password : "+ new String(value.getPassword());
label.setText(data);
}
public static void main(String args[]){
PasswordFieldExample pf=new PasswordFieldExample();
}
}
