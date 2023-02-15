package MyEXE_Spring_REST_JPA.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import MyEXE_Spring_REST_JPA.models.Cliente;
import MyEXE_Spring_REST_JPA.repositories.MyClienteRepository;


@Component
@Order(1)
public class MyCLRunnerClienti implements CommandLineRunner {
	@Autowired
	MyClienteRepository myClienteRepository;
	
	@Override
	public void run(String... args) throws Exception {	
//		myClienteRepository.save(new Cliente("Giorgio","Rossucci","1274 6451 4895 3817"));
//		myClienteRepository.save(new Cliente("Giovanni","Rossini","1145 6441 2345 6781"));
//		myClienteRepository.save(new Cliente("Giuseppe","Verdi","4934 5731 4621 0972"));
//		myClienteRepository.save(new Cliente("Giggi","Verducci","1034 4813 0495 6741"));
//		myClienteRepository.save(new Cliente("Mario","Rini","3789 5038 4921 5351"));
//		myClienteRepository.save(new Cliente("Aldo","Fortunato","9041 5832 5853 4822"));
//		myClienteRepository.save(new Cliente("Ale","Santo","4837 4281 5328 5923"));
//		myClienteRepository.save(new Cliente("Giacomo","Fortuna","4892 6837 6839 6866"));

	}
}
