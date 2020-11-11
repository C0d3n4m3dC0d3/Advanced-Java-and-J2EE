/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                7. Program for OptionPane with more formats                 */
/*                    Components: JFrame, JOptionPane                         */
/*                            showInputDialog                                 */
/******************************************************************************/

import javax.swing.*;

class OptionPane5{
  JFrame f;

  OptionPane5(){
    f = new JFrame();
    String mssg;
    mssg = JOptionPane.showInputDialog(f, "Enter your message:");
    JOptionPane.showMessageDialog(f, mssg);
  }

  public static void main(String args[]){
    new OptionPane5();
  }
}
