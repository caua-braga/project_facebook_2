package gui;

import java.awt.*;
import javax.swing.*;

import models.Associated;
import models.Fruit;

public class DeckWindow extends JFrame implements Associated
{
    public DeckWindow()
    {
        this.setSize(600, 300);
        this.setTitle("Project Facebook 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getUpPanel();
        this.setVisible(true);
    }
    
    private void getUpPanel() 
    {
    	JPanel upPanel = new JPanel();
    	upPanel.setBackground(Color.ORANGE);
        upPanel.setLayout(new FlowLayout());
    	this.add(upPanel, BorderLayout.NORTH);
        getCenterPanel();

    }

    private void getCenterPanel() 
    {
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.yellow);
        centerPanel.setLayout(new GridLayout(5, 4));
        
//        Fruit cards[] = Fruit.values();
//        for(int i = 0; i < cards.length; i++)
//        {
//            centerPanel.add(Associated.getCard(cards[i]).getButton());
//        }
        for(Fruit f : Fruit.values())
        {
        	centerPanel.add(Associated.getCard(f).getButton());
        }

        this.add(centerPanel, BorderLayout.CENTER);
    }

    
 }
