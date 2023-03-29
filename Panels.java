package panels;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panels extends JFrame{
    // Constructor
    public Panels(){
        // Add button into the frame
        Container container = getContentPane();
        
        // Set FlowLayout, alignt left with horizontal 25 gap and vertical 25 gap between components
        container.setLayout(new BorderLayout());  
        
        // Creat Panel Pnl for Buttons and set GridLayout
        JPanel pn1 = new JPanel();
        pn1.setLayout(new GridLayout(4, 3));

        // Add button into the frame
        for (int i = 1; i < 10; i++) {
            pn1.add(new JButton("" + i));
        }
        pn1.add(new JButton("0"));
        pn1.add(new JButton("Start"));
        pn1.add(new JButton("Stop"));
        
        // Creat Panel Pn2 to hold a textfield and pn1
        JPanel pn2 = new JPanel();
        pn2.add(new JTextField("Time to displayed here"), BorderLayout.NORTH);
        pn2.add(pn1, BorderLayout.CENTER);
        
        // Add pn2 and a button to the frame
        container.add(pn2, BorderLayout.EAST);
        container.add(new JButton("Food to be placed here"), BorderLayout.CENTER);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Panels frame = new Panels();
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
