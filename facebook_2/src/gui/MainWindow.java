package gui;
<<<<<<< HEAD

import java.awt.BorderLayout;
=======
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
>>>>>>> db53aa4009b7f7ae6f886979be6206d1619b0c64

import javax.swing.JFrame;
import javax.swing.JPanel;

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
<<<<<<< HEAD
        panel.add(new InitButton("START",this), BorderLayout.CENTER);
        this.add(panel);
    }
    
    
=======
        this.add(panel);
        panel.add(new InitButton().getButton("COMEÇAR!"), BorderLayout.CENTER);
    }
>>>>>>> db53aa4009b7f7ae6f886979be6206d1619b0c64


}
