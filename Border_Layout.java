package border_layout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class Border_Layout extends JFrame {    // divides the container into five areas
// Constructor
    public Border_Layout(){
        // Add button into the frame
        Container container = getContentPane();
        
        // Set BorderLayout with horizontal 5 gap and vertical 10 gap
        container.setLayout(new BorderLayout(5, 10));  
        
        // Add button into the frame
        container.add(new JButton("EAST"), BorderLayout.EAST);
        container.add(new JButton("WEST"), BorderLayout.WEST);
        container.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        container.add(new JButton("NORTH"), BorderLayout.NORTH);
        container.add(new JButton("CENTER"), BorderLayout.CENTER);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Border_Layout frame = new Border_Layout();
        frame.setTitle("New Frame");
        
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
