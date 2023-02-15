package MyEXE_Spring_REST_JPA.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MyEXE_Spring_REST_JPA.models.Prodotto;
import MyEXE_Spring_REST_JPA.services.MyServiceProdotto;

@RestController
@RequestMapping("/prodotti")
public class MyRestControllerProdotti {

	// autowired è una scorciatoia per evitare di cercare il bean
	@Autowired
	private MyServiceProdotto myService;
	
	/* GET */
	@GetMapping("/mygetallprodotti")
	public List<Prodotto> myGetAllProdotti() {
		return myService.myFindAllProdotti();
	}
	/* Insert */
	@PostMapping("/myinsertprodotto")
	public String myInsertProdotto(@RequestBody Prodotto myprodotto) {
		return myService.myInsertProdotto(myprodotto);
	}
	
	/* Update */
	@GetMapping("/myupdateprodotto")
	public String myUpdateProdotto(@RequestBody Prodotto myprodotto) {
		return myService.myUpdateProdotto(myprodotto);
	}
	
	/* Delete */
	@DeleteMapping("/mydeleteprodotto/{id}")
	public String myDeleteProdotto(@PathVariable int id) {
		return myService.myDeleteProdotto(id);
	}
	
}

