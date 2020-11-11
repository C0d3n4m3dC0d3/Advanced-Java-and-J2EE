/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                4. Program for OptionPane with more formats                 */
/*                    Components: JFrame, JOptionPane                         */
/*                          INFORMATION_MESSAGE                               */
/******************************************************************************/

import javax.swing.*;

public class OptionPane2{
  JFrame f;
  OptionPane2(){
    f  = new JFrame();
    JOptionPane.showMessageDialog(f, "Installation Complete", "Successful", JOptionPane.INFORMATION_MESSAGE);
  }
  public static void main(String args[]){
    new OptionPane2();
  }
}
