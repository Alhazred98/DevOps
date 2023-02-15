package MyEXE_Spring_REST_JPA.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ordine;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cliente")
	private Cliente cliente;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="prodotto")
	private Prodotto prodotto;
	
	public Ordine() {}
	public Ordine(Cliente cliente, Prodotto prodotto) {
		this.cliente = cliente;
		this.prodotto = prodotto;
	}
	
	public int getId_ordine() {
		return id_ordine;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	@Override
	public String toString() {
		return "Ordine [id_ordine=" + id_ordine + ", cliente=" + cliente + ", prodotto=" + prodotto + "]";
	}
	


}
