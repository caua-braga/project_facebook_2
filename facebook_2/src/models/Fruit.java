package models;

import java.util.Random;

public enum Fruit 
{
    banana,
    maca,
    laranja,
    limao,
    mamao,
    acerola,
    uva,
    manga,
    goiaba,
    tomate,
    maracuja,
    ciriguela,
    jaca,
    roma,
    morango,
    cereja,
    tangerina,
    pera,
    pessego,
    jabuticaba;
    

    public static Fruit randomFruit()
    {
        Fruit fruits[] = values();
        Random drawer = new Random();

        return fruits[drawer.nextInt(fruits.length)];
    }
}
