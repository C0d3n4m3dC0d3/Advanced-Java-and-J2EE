/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                5. Program for OptionPane with more formats                 */
/*                    Components: JFrame, JOptionPane                         */
/*                            WARNING_MESSAGE                                 */
/******************************************************************************/

import javax.swing.*;

public class OptionPane3{
  JFrame f;

  OptionPane3(){
    f = new JFrame();
    JOptionPane.showMessageDialog(f, "Partial Upgrade. Abnormally exited.", "Alert", JOptionPane.WARNING_MESSAGE);
  }
  public static void main(String args[]){
    new OptionPane3();
  }
}
