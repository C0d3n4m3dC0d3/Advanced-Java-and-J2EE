/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*             9. Program for RadioButton with ActionListener                 */
/*             Components: JFrame, JRadioButton, JOptionPane                  */
/******************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radio implements ActionListener{
  JFrame f; JButton b;
  JRadioButton rb1, rb2;
  Radio(){
   f = new JFrame("RadioButton");
   rb1 = new JRadioButton("Male");
   rb2 = new JRadioButton("Female");
   rb1.setBounds(100,50, 100, 30);
   rb2.setBounds(100,100, 100, 30);
   ButtonGroup bg = new ButtonGroup();
   bg.add(rb1); bg.add(rb2);
   b = new JButton("Click!");
   b.setBounds(100, 150, 100, 30);
   b.addActionListener(this);

   f.add(rb1); f.add(rb2);
   f.add(b);

   f.setVisible(true);
   f.setSize(300,300);
   f.setLayout(null);
   f.getContentPane().setBackground(Color.YELLOW);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){
     if(rb1.isSelected()){
      JOptionPane.showMessageDialog(f, "You have selected Male.");
     }
     if(rb2.isSelected()){
      JOptionPane.showMessageDialog(f, "You have selected Female.");
     }
  }

  public static void main(String args[]){
    new Radio();
  }
}
