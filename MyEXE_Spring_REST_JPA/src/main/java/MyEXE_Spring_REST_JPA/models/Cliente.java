package MyEXE_Spring_REST_JPA.models;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	private String nome;
	private String cognome;
	private String cartaDiCredito;
	// one to many ordini
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cliente", referencedColumnName = "id_cliente")
	private List<Ordine> ordine;
	

	public Cliente() {}
	public Cliente(String nome, String cognome, String cartaDiCredito) {
		this.nome = nome;
		this.cognome = cognome;
		this.cartaDiCredito = cartaDiCredito;
		this.ordine = new ArrayList<Ordine>();
	}
	public int getId_cliente() {
		return id_cliente;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCartaDiCredito() {
		return cartaDiCredito;
	}
	public void setCartaDiCredito(String cartaDiCredito) {
		this.cartaDiCredito = cartaDiCredito;
	}
//
//	public List<Ordine> getOrdine() {
//		return ordine;
//	}
//	public void setOrdine(List<Ordine> ordine) {
//		this.ordine = ordine;
//	}
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nome=" + nome + ", cognome=" + cognome + ", cartaDiCredito="
				+ cartaDiCredito + "]";
	}
	
}
