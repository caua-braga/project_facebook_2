package models;

import javax.swing.*;

public class CardButton extends JButton
{
    ImageIcon card;
    
    public JButton getCardButton(ImageIcon card)
    {
        JButton button = new JButton();
        button.setIcon(card);
        // button.addActionListener(button);

        return button;
    }


}
