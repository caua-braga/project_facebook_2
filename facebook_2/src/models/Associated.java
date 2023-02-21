package models;

import javax.swing.*;
import java.awt.*;

interface Associated 
{
    public static Card getCard(Fruit name, Type type)
    {
        Card card = new Card(name, type);
        
        switch(card.getName())
        {
            case banana:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Banana_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(1);
                card.setCost(1);
                break;
            case acerola:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Acerola.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(3);
                card.setCost(2);
                break;
            case cereja:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Cereja.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                break;
            case goiaba:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Goiaba.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(4);
                card.setCost(3);
                break;
            case jabuticaba:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Jabuticaba.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(2);
                card.setCost(2);
                break;
            case jaca:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Jaca.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(4);
                card.setHp(4);
                card.setCost(4);
                break;
            case laranja:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Laranja_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(1);
                card.setCost(1);
                break;
            case limao:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Limão.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(1);
                card.setCost(1);
                break;
            case mamao:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Mamão_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                break;
            case manga:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Manga.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(4);
                card.setCost(3);
                break;
            case maracuja:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Maracujá.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(4);
                card.setHp(2);
                card.setCost(4);
                break;
            case maca:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Maçã_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(1);
                card.setCost(1);
                break;
            case morango:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Morango_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                break;
            case pera:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Pera.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                break;
            case pessego:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Pêssego_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(4);
                card.setCost(3);
                break;
            case roma:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Romã.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(4);
                card.setCost(4);
                break;
            case ciriguela:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Siriguela.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(3);
                card.setCost(2);
                break;
            case tangerina:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Tangerina.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(3);
                card.setCost(3);
                break;
            case tomate:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Tomate.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(4);
                card.setCost(4);
                break;
            case uva:
                card.setButton(new CardButton().getCardButton(new ImageIcon(new ImageIcon("basic_img/Uva.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(3);
                card.setCost(1);
                break;

        }

        return card;
    }
}
