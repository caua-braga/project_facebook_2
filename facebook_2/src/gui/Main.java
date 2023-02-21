package gui;

import models.Card;
import models.Fruit;
import models.Type;

public class Main 
{

	public static void main(String[] args) 
	{
        MainWindow window = new MainWindow();

		//chama o metodo e retorna o nome de uma carta aleatoria
		System.out.println(cardGenerator().getName());
		System.out.println(cardGenerator().getName());
		System.out.println(cardGenerator().getName());
		System.out.println(cardGenerator().getName());

		System.out.println("-------------------");
		
		//laco que retorna todas as cartas basicas (mas eh preciso seta-las primeiro)
		int i= 0;
		while(cardGenerator().getType().equals(Type.Basic)  &&  i < Fruit.values().length)
		{
			System.out.println(cardGenerator().getName());
			i++;
		}
	}

	//metodo que retorna uma carta aleatoria
	public static Card cardGenerator()
	{
		Card card = new Card(Fruit.randomFruit(), null);

		//exemplo de diferenciacao de cartas
		if(card.getName().equals(Fruit.banana))
		{
			card.setType(Type.Basic);
			card.setCost(1);
			card.setHp(1);
			card.setAttack(1);
		}

		return card;
	}
}


