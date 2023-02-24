
package gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
	public MainWindow()
    {
        this.setSize(600, 300);
        this.setTitle("Project Facebook 2");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        createPanelSlogan();
        createPanelButton();
        this.setVisible(true);
        
    }
	
	/*
	 * da uma melhorada na fonte 
	 */
//	private void createPanelSlogan()
//	{
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.BLACK);
//		JLabel label=new JLabel();
//		label.setForeground(Color.WHITE);
//		label.setText("WELCOME TO FACEBOOK 2");
//		label.setFont(new Font("courier", Font.ITALIC, 30 ));
//		panel.add(label);
//		this.add(panel, BorderLayout.NORTH);
//	}

    private void createPanelButton() 
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new InitButton("START",this), BorderLayout.CENTER);
        this.add(panel,BorderLayout.CENTER);
    }
}
