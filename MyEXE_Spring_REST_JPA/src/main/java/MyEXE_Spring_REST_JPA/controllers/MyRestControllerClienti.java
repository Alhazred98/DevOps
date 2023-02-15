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

import MyEXE_Spring_REST_JPA.models.Cliente;
import MyEXE_Spring_REST_JPA.services.MyServiceCliente;

@RestController
@RequestMapping("/clienti")
public class MyRestControllerClienti {

	// autowired è una scorciatoia per evitare di cercare il bean
	@Autowired
	private MyServiceCliente myService;
	/* GET */
	@GetMapping("/mygetallclienti")
	public List<Cliente> myGetAllClienti() {
		return myService.myFindAllClienti();
	}
	/* Insert */
	@PostMapping("/myinsertcliente")
	public String myInsertCliente(@RequestBody Cliente myCliente) {
		return myService.myInsertCliente(myCliente);
	}
	
	/* Update */
	@GetMapping("/myupdatecliente")
	public String myUpdateCliente(@RequestBody Cliente myCliente) {
		return myService.myUpdateCliente(myCliente);
	}
	
	/* Delete */
	@DeleteMapping("/mydeletecliente/{id}")
	public String myDeleteCliente(@PathVariable int id) {
		return myService.myDeleteCliente(id);
	}
	
}
