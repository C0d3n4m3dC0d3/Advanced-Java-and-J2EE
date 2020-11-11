/******************************************************************************/
/*                           JAVA SWING CONTROLS                              */
/*                  1. Basic program demonstrating Swings                     */
/*                       Components: JFrame, JButton                          */
/******************************************************************************/

import java.awt.*;
import javax.swing.*;

class Swing1{
    JFrame f;
    JButton b;
    Swing1(){
      f = new JFrame("Basic");
      b = new JButton("Click Me!");
      f.add(b);
      f.setLayout(new FlowLayout());
      f.setVisible(true);
      f.setSize(500,500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
      new Swing1();
    }
}
