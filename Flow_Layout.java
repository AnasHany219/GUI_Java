package flowlayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

public class Flow_Layout extends JFrame {   // Arranges components from left to right
    // Constructor
    public Flow_Layout(){
        // Add button into the frame
        Container container = getContentPane();
        
        // Set FlowLayout, alignt left with horizontal 25 gap and vertical 25 gap between components
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 25, 25));  
        
        // Add button into the frame
        for (int i = 0; i < 10; i++) {
            container.add(new JButton("Container" + i));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Flow_Layout frame = new Flow_Layout();
        frame.setTitle("New Frame");
        
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
