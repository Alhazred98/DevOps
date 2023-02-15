package MyEXE_Spring_REST_JPA.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import MyEXE_Spring_REST_JPA.models.Cliente;


//jparepository<tipo entity, tipo primarykey dell'entity>
public interface MyClienteRepository extends JpaRepository<Cliente, Integer> {

	//update
	@Transactional
	@Modifying
	@Query("UPDATE Cliente c SET c.nome = ?1, c.cognome = ?2, c.cartaDiCredito = ?3 where c.id_cliente = ?4")
	public void myUpdateClienteById(String nome, String cognome, String cartaDiCredito, int id);
	
}

