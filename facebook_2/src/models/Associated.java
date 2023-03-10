package models;

import javax.swing.*;
import java.awt.*;

public interface Associated 
{
    public static Card getCard(Fruit name)
    {
        Card card = new Card(name, null);
        
        switch(card.getName())
        {
            case banana:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Banana_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(1);
                card.setCost(1);
                card.setType(Type.Basic);
                break;
            case acerola:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Acerola.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(3);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case cereja:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Cereja.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case goiaba:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Goiaba.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(4);
                card.setCost(3);
                card.setType(Type.Basic);
                break;
            case jabuticaba:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Jabuticaba_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(2);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case jaca:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Jaca.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(4);
                card.setHp(4);
                card.setCost(4);
                card.setType(Type.Basic);
                break;
            case laranja:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Laranja_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(1);
                card.setCost(1);
                card.setType(Type.Basic);
                break;
            case limao:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Lim??o_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(1);
                card.setCost(1);
                card.setType(Type.Basic);
                break;
            case mamao:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Mam??o_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case manga:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Manga.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(4);
                card.setCost(3);
                card.setType(Type.Basic);
                break;
            case maracuja:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Maracuj??.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(4);
                card.setHp(2);
                card.setCost(4);
                card.setType(Type.Basic);
                break;
            case maca:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Ma????_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(1);
                card.setCost(1);
                card.setType(Type.Basic);
                break;
            case morango:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Morango_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case pera:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Pera.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(2);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case pessego:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/P??ssego_.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(4);
                card.setCost(3);
                card.setType(Type.Basic);
                break;
            case roma:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Rom??.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(4);
                card.setCost(4);
                card.setType(Type.Basic);
                break;
            case ciriguela:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Siriguela.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(3);
                card.setCost(2);
                card.setType(Type.Basic);
                break;
            case tangerina:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Tangerina.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(3);
                card.setHp(3);
                card.setCost(3);
                card.setType(Type.Basic);
                break;
            case tomate:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Tomate.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(2);
                card.setHp(4);
                card.setCost(4);
                card.setType(Type.Basic);
                break;
            case uva:
                card.setButton(new CardButton(new ImageIcon(new ImageIcon("models.basic_img/Uva.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
                card.setAttack(1);
                card.setHp(3);
                card.setCost(1);
                card.setType(Type.Basic);
                break;

        }

        return card;
    }
}
