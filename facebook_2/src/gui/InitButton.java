package gui;

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
}
