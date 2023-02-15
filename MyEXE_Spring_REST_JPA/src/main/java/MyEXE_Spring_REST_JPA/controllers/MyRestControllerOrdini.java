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

import MyEXE_Spring_REST_JPA.models.Ordine;
import MyEXE_Spring_REST_JPA.services.MyServiceOrdine;

@RestController
@RequestMapping("/ordini")
public class MyRestControllerOrdini {

	// autowired è una scorciatoia per evitare di cercare il bean
	@Autowired
	private MyServiceOrdine myService;
	
	/* GET */
	@GetMapping("/mygetallordini")
	public List<Ordine> myGetAllOrdini() {
		return myService.myFindAllOrdini();
	}
	/* Insert */
	@PostMapping("/myinsertordine")
	public String myInsertOrdine(@RequestBody Ordine myordine) {
		return myService.myInsertOrdine(myordine);
	}
	
	/* Update */
	@GetMapping("/myupdateordine")
	public String myUpdateOrdine(@RequestBody Ordine myordine) {
		return myService.myUpdateOrdine(myordine);
	}
	
	/* Delete */
	@DeleteMapping("/mydeleteordine/{id}")
	public String myDeleteOrdine(@PathVariable int id) {
		return myService.myDeleteOrdine(id);
	}
	
}


