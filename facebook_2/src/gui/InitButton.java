package gui;

<<<<<<< HEAD
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

=======
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;

public class InitButton extends JButton implements Action
{
    String name;

    public JButton getButton(String name)
    {
        this.name = name;
        JButton button = new JButton();
        button.setName(name);
        button.setVisible(true);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
>>>>>>> db53aa4009b7f7ae6f886979be6206d1619b0c64
}
