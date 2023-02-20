package negocio;

import javax.swing.JButton;

public class Cartas {
	private String name;
	private int hp;
	private int atack;
	private JButton button;
	private Tipo type;
	
	public Cartas(String name,int hp,int atack,Tipo type) {
		this.name=name;
		this.hp=hp;
		this.atack=atack;
		this.type=type;
	}
	public String getNome() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAtaque() {
		return atack;
	}
	public JButton getButton() {
		return button;
	}
	public void createButton() {
		JButton button=new JButton();
		this.button = button;
	}
	public Tipo tipo() {
		return type;
	}
	

}
