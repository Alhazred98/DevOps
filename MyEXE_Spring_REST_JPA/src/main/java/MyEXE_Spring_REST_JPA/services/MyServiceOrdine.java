package MyEXE_Spring_REST_JPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyEXE_Spring_REST_JPA.models.Ordine;
import MyEXE_Spring_REST_JPA.repositories.MyOrdineRepository;

@Service
public class MyServiceOrdine {
	@Autowired
	MyOrdineRepository myordineRepository;
	
	
	public List<Ordine> myFindAllOrdini(){
		return myordineRepository.findAll();
	}
	public String myInsertOrdine(Ordine ordine) {
		myordineRepository.save(ordine);
		return "ordine inserito";
	}
	public String myUpdateOrdine(Ordine ordine) {
		myordineRepository.myUpdateOrdineById(ordine.getCliente(), ordine.getProdotto(), ordine.getId_ordine());
		return "ordine updated";
	}
	public String myDeleteOrdine(Integer id_ordine) {
		myordineRepository.deleteById(id_ordine);	
		return "ordine removed";
	}
	
}
