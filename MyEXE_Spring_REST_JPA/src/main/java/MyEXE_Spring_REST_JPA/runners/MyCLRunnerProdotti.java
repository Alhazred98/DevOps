package MyEXE_Spring_REST_JPA.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import MyEXE_Spring_REST_JPA.models.Prodotto;
import MyEXE_Spring_REST_JPA.repositories.MyProdottoRepository;


@Component
@Order(2)
public class MyCLRunnerProdotti implements CommandLineRunner {	
	@Autowired
	MyProdottoRepository myProdottoRepository;
	
	@Override
	public void run(String... args) throws Exception {	
//		myProdottoRepository.save(new Prodotto("IPhone", "Apple", 899.99));
//		myProdottoRepository.save(new Prodotto("IPad", "Apple", 999.99));
//		myProdottoRepository.save(new Prodotto("IMac", "Apple", 1899.99));
//		myProdottoRepository.save(new Prodotto("p20", "Huawei", 599.99));
//		myProdottoRepository.save(new Prodotto("p30", "Huawei", 699.99));
//		myProdottoRepository.save(new Prodotto("p10", "Huaweie", 299.99));
//		myProdottoRepository.save(new Prodotto("One Plus 6", "One Plus", 499.99));
//		myProdottoRepository.save(new Prodotto("One Plus 7", "One Plus", 599.99));
//		myProdottoRepository.save(new Prodotto("One Plus 8", "One Plus", 699.99));

	}
}
