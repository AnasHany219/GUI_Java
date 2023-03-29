package jframes;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class JFrames {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("New Frame");

        frame.setSize(400, 300);
        frame.setVisible(true);

        // Get The dimentions of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWith = screenSize.width;
        int screenHeight = screenSize.height;

        // Locate the (x, y) to Center the Frame
        int x = (screenWith - frame.getWidth()) / 2;
        int y = (screenHeight - frame.getHeight()) / 2;

        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
