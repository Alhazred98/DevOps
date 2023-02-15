package MyEXE_Spring_REST_JPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyEXE_Spring_REST_JPA.models.Cliente;
import MyEXE_Spring_REST_JPA.repositories.MyClienteRepository;


@Service
public class MyServiceCliente {
	@Autowired
	MyClienteRepository myClienteRepository;
	

	
	public List<Cliente> myFindAllClienti() {
		return myClienteRepository.findAll();
	}
	public String myInsertCliente(Cliente cliente) {
		myClienteRepository.save(cliente);
		return "cliente inserito";
	}
	public String myUpdateCliente(Cliente cliente) {
		myClienteRepository.myUpdateClienteById(cliente.getNome(), cliente.getCognome(), cliente.getCartaDiCredito(), cliente.getId_cliente());
		return "cliente updated";
	}
	public String myDeleteCliente(Integer id_cliente) {
		myClienteRepository.deleteById(id_cliente);	
		return "cliente removed";
	}
	

}
