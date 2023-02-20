package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InitButton extends JButton{
	String text;

    public InitButton(String text,JFrame frame)
    {
        this.text = text;
        this.setText(text);
        this.setBackground(Color.BLUE);
        this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				DeckWindow deck = new DeckWindow();
			}
		});
        this.setVisible(true);
    }
}
