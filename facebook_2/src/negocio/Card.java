package negocio;

import javax.swing.JButton;

public class Card {
	private String name;
	private int hp;
	private int attack;
	private JButton button;
	private Type type;

	public Card(String name,int hp,int attack,Type type) {
		this.name=name;
		this.hp=hp;
		this.attack=attack;
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAttack() {
		return attack;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public Type getType() {
		return type;
	}

}
