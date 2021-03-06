package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	public static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String email;
	private Date dataDeNascimento = new Date();
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String email, Date dataDeNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataDeNascimento() {
		return sdf.format(dataDeNascimento);
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
