package gui;

import java.awt.*;
import javax.swing.*;

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
    	JPanel upPanel = new JPanel();
    	upPanel.setBackground(Color.ORANGE);
        upPanel.setLayout(new FlowLayout());
    	this.add(upPanel);
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.yellow);
        centerPanel.setLayout(new GridLayout(5, 4));
        this.add(centerPanel);
    }

    
 }
