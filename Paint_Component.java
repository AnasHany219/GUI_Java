package paint_component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint_Component extends JPanel{
    /* Main Method */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("DrowMessage");
        frame.getContentPane().add(new Paint_Component());
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /* Paint the message */
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("SensSerif", Font.BOLD, 32));
        g.drawString("Welcome to java", 50, 50);
    }
}
