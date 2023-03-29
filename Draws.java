package draw_line;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draws extends JPanel {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("DrowMessage");
        frame.getContentPane().add(new Draws());
        frame.setSize(900, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /* Paint the message */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("SensSerif", Font.BOLD, 32));

        // To Draw a Line
        g.drawLine(10, 10, 90, 90);
        
        // To Draw a rectangle
        g.drawRect(90, 90, 50, 50);
        g.fillRect(40, 140, 50, 50);
        g.draw3DRect(140, 140, 50, 50, true);
        g.drawRoundRect(190, 90, 50, 50, 10, 10);
        
        // To Draw oval
        g.drawOval(240, 140, 50, 50);
        g.fillOval(290, 90, 50, 50);
        
        // To Draw arc
        g.drawArc(340, 140, 50, 50, 0, 180);
        g.fillArc(390, 90, 50, 50, 0, 90);
        
        // Tp Draw Polygon
        int []x = {500, 550, 600, 600, 550, 500};
        int []y = {100, 50, 100, 200, 250, 200};
        g.drawPolygon(x, y, 6);
        int []a = {700, 750, 800, 800};
        int []b = {100, 50, 100, 200};
        g.drawPolyline(a, b, 4);
    }
}
