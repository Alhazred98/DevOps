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
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prodotto;
	private String nome;
	private String marca;
	private Double prezzo;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="prodotto", referencedColumnName = "id_prodotto")
	private List<Ordine> ordine;
	
	public Prodotto() {}
	public Prodotto(String nome, String marca, Double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.ordine = new ArrayList<Ordine>();
	}
	public int getId_prodotto() {
		return id_prodotto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Prodotto [id_prodotto=" + id_prodotto + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo
				+  "]";
	}
	

}
