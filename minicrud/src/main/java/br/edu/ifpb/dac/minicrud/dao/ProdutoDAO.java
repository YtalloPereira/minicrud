package br.edu.ifpb.dac.minicrud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifpb.dac.minicrud.model.Produto;

@Repository
public interface ProdutoDAO extends CrudRepository<Produto, Long> {
	
}
