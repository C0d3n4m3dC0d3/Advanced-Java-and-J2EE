/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                8. Program for OptionPane with more formats                 */
/*               Components: JFrame, JOptionPane, WindowAdapter               */
/*                            showConfirmDialog()                             */
/******************************************************************************/

import java.awt.event.*;
import javax.swing.*;

public class OptionPane6 extends WindowAdapter{
 JFrame f;
 OptionPane6(){
  f = new JFrame();
  f.addWindowListener(this);
  f.setSize(300,300);
  f.setLayout(null);
  f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  f.setVisible(true);
 }
 public void windowClosing(WindowEvent e){
  int opt = JOptionPane.showConfirmDialog(f, "Are you sure?");
  if(opt == JOptionPane.YES_OPTION)
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public static void main(String args[]){
  new OptionPane6();
 }
}
