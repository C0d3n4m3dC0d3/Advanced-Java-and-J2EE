/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                6. Program for OptionPane with more formats                 */
/*                    Components: JFrame, JOptionPane                         */
/*                              ERROR_MESSAGE                                 */
/******************************************************************************/

import javax.swing.*;

class OptionPane4{
  JFrame f;
  OptionPane4(){
    f = new JFrame();
    JOptionPane.showMessageDialog(f, "Failed Installation", "Error", JOptionPane.ERROR_MESSAGE);
  }

  public static void main(String args[]){
    new OptionPane4();
  }
}
