package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame
{
    public MainWindow()
    {
        this.setSize(300, 600);
        this.setTitle("Project Facebook 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getPanel();
        this.setVisible(true);
        
    }

    private void getPanel() 
    {
        this.setLayout(new BorderLayout());
        panel.add(new InitButton().getButton("COMEÇAR!"), BorderLayout.CENTER);
    }


}
