package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DeckWindow extends JFrame
{
    public DeckWindow()
    {
        this.setSize(600, 300);
        this.setTitle("Project Facebook 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getPanel();
        this.setVisible(true);
    }
    
    private void getPanel() 
    {
    	JPanel panel = new JPanel();
    	panel.setBackground(Color.darkGray);
    	this.add(panel);
    }

    
 }
