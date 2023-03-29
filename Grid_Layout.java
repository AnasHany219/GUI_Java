package grid_layout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;

public class Grid_Layout extends JFrame{  // Arranges components as a matrix
    // Constructor
    public Grid_Layout(){
        // Add button into the frame
        Container container = getContentPane();
        
        // Set GridLayout, 4 rows, 3 columns, and 5 gaps between components horizontally and vertically
        container.setLayout(new GridLayout(5, 2, 5, 5));  
        
        // Add button into the frame
        for (int i = 0; i < 10; i++) {
            container.add(new JButton("Container" + i));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Grid_Layout frame = new Grid_Layout();
        frame.setTitle("New Frame");
        
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }     
}
