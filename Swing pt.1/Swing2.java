/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                  2. Swing controls with ActionListener                     */
/*                 Components: JFrame, JButton, JTextField                    */
/******************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing2 implements ActionListener{
  JFrame f;
  JButton b;
  JTextField tf;
  Swing2(){
    f = new JFrame("Action!");
    tf = new JTextField();
    b = new JButton("OK");

    tf.setBounds(10,25,100,50);
    b.setBounds(130, 25, 100, 50);

    b.addActionListener(this);
    f.add(tf);
    f.add(b);
    f.setLayout(new BorderLayout());
    f.setVisible(true);
    f.setSize(400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){
    tf.setText("Hello, world!");
  }

  public static void main(String args[]){
    new Swing2();
  }
}
