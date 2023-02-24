package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegistrationWindow extends JFrame{
	public RegistrationWindow(JFrame frame)
	{
		this.setSize(600, 300);
        this.setTitle("Project Facebook 2");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        createPanel();
        createButton(frame);
        this.setVisible(true);	
	}
	
	private void createPanel()
	{
		JPanel panel=new JPanel();
		JLabel label = new JLabel("please, enter your name first");
		JTextField text=new JTextField(20);
		panel.add(label);
		panel.add(text);
		this.add(panel, BorderLayout.NORTH);
	}
	
	private void createButton(JFrame frame)
	{
		JPanel panel=new JPanel();
		JButton button = new JButton("next");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				DeckWindow deck = new DeckWindow();
			}
		});
		panel.add(button);
		this.add(panel, BorderLayout.SOUTH);
	}
}
