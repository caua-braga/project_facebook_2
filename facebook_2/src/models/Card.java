package models;

import javax.swing.JButton;

public class Card implements Associated
{
	private Fruit name;
	private int hp;
	private int attack;
	private int cost;
	private CardButton button;
	private Type type;

	public Card(Fruit name, Type type) 
	{
		this.name=name;
		this.type=type;
	}
	public Fruit getName() {
		return name;
	}

	public void setHp(int hp)
	{
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}
	
	public int getAttack() {
		return attack;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}
	public CardButton getButton() {
		return button;
	}
	public void setButton(CardButton button) {
		this.button = button;
	}

	public void setType(Type type)
	{
		this.type = type;
	}
	public Type getType() {
		return type;
	}

}
