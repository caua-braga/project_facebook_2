package negocio;

import javax.swing.JButton;

public class Cartas {
	private String nome;
	private int hp;
	private int ataque;
	private JButton button;
	private Tipo tipo;
	
	public Cartas(String nome,int hp,int ataque,Tipo tipo) {
		this.nome=nome;
		this.hp=hp;
		this.ataque=ataque;
		this.tipo=tipo;
	}
	public String getNome() {
		return nome;
	}
	public int getHp() {
		return hp;
	}
	public int getAtaque() {
		return ataque;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public Tipo tipo() {
		return tipo;
	}
	

}
