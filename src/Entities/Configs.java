package Entities;

public class Configs {
	private String nome;
	private String email;

	public Configs(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Configs() {
		// None
	}
	// Name
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return nome;
	}
	
	// Email
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}
