/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                  3. Program demonstrating JOptionPane                      */
/*                      Components: JFrame, JOptionPane                       */
/******************************************************************************/

import javax.swing.*;
//We don't import java.awt.* package here, because we're not using Layouts

public class OptionPane1{
  JFrame f;
  OptionPane1(){
    f = new JFrame();
    JOptionPane.showMessageDialog(f, "Hey! This is a message dialog!");
  }

  public static void main(String args[]){
    new OptionPane1();
  }
}

//Also,the Frame will not be visible, as it's visibility is set to false,
//by default. And, setDefaultCloseOperation was also not set, hence, we
//must terminate the program using Ctrl + C
