package MyEXE_Spring_REST_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import MyEXE_Spring_REST_JPA.models.Cliente;
import MyEXE_Spring_REST_JPA.models.Ordine;
import MyEXE_Spring_REST_JPA.models.Prodotto;

public interface MyOrdineRepository extends JpaRepository<Ordine, Integer> {
	
	
	//update
	@Transactional
	@Modifying
	@Query("UPDATE Ordine o SET o.cliente = ?1, o.prodotto = ?2 WHERE o.id_ordine = ?3")
	public void myUpdateOrdineById(Cliente cliente, Prodotto prodotto, int id);
	

}
