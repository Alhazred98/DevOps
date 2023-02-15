package MyEXE_Spring_REST_JPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyEXE_Spring_REST_JPA.models.Prodotto;
import MyEXE_Spring_REST_JPA.repositories.MyProdottoRepository;

@Service
public class MyServiceProdotto {
	@Autowired
	MyProdottoRepository myprodottoRepository;
	public List<Prodotto> myFindAllProdotti(){
		return myprodottoRepository.findAll();
	}
	public String myInsertProdotto(Prodotto prodotto) {
		myprodottoRepository.save(prodotto);
		return "prodotto inserito";
	}
	public String myUpdateProdotto(Prodotto prodotto) {
		myprodottoRepository.myUpdateProdottoById(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getId_prodotto());
		return "prodotto updated";
	}
	public String myDeleteProdotto(Integer id_prodotto) {
		myprodottoRepository.deleteById(id_prodotto);	
		return "prodotto removed";
	}
}
