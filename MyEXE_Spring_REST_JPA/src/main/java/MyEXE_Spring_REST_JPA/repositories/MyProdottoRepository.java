package MyEXE_Spring_REST_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import MyEXE_Spring_REST_JPA.models.Prodotto;


public interface MyProdottoRepository extends JpaRepository<Prodotto, Integer> {
	//update
	@Transactional
	@Modifying
	@Query("UPDATE Prodotto p SET p.nome = ?1, p.marca = ?2, p.prezzo = ?3 WHERE p.id_prodotto = ?4")
	public void myUpdateProdottoById(String nome, String cognome, Double prezzo, int id);
	
}
