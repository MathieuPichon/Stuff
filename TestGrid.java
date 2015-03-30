import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGrid extends JFrame {
    
    private JPanel mainGrid;
    private Dimension size;
    
    public TestGrid() {
        super("Algorithm test");
        this.setSize(500,500);
        Dimension size = new Dimension(100,100);
        GridLayout layout = new GridLayout(10,10,5,5);
        JPanel mainGrid = new JPanel(layout);
        
        mainGrid.setBackground(Color.black);
        
        for(int i=0;i<100;i++) {
            JButton a = new JButton();
            
            mainGrid.add(a);
        }
        this.setContentPane(mainGrid);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String [] args) {
        JFrame myGrid = new TestGrid();
    }
    
    public void ActionPerformed(ActionEvent e) {
    
    }
}
