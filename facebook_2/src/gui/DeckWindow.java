package gui;

<<<<<<< HEAD
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DeckWindow extends JFrame{
	public DeckWindow()
    {
        this.setSize(600, 300);
=======
import javax.swing.JFrame;

public class DeckWindow extends JFrame
{
    public DeckWindow()
    {
        this.setSize(300, 600);
>>>>>>> db53aa4009b7f7ae6f886979be6206d1619b0c64
        this.setTitle("Project Facebook 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getPanel();
        this.setVisible(true);
        
    }

    private void getPanel() 
    {
<<<<<<< HEAD
    	JPanel panel = new JPanel();
    	panel.setBackground(Color.darkGray);
    	this.add(panel);
    }

=======
    
    }
>>>>>>> db53aa4009b7f7ae6f886979be6206d1619b0c64
}
