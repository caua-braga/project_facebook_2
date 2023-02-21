package gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
	public MainWindow()
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
        panel.setLayout(new BorderLayout());
        panel.add(new InitButton("START",this), BorderLayout.CENTER);
        this.add(panel);
    }
}
