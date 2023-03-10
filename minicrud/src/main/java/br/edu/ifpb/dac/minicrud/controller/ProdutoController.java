package br.edu.ifpb.dac.minicrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.edu.ifpb.dac.minicrud.dao.ProdutoDAO;
import br.edu.ifpb.dac.minicrud.model.Produto;



@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	public void create(Produto novoProduto) {
		produtoDAO.save(novoProduto);
	}
	
	public Iterable<Produto> listAll(){
		return this.produtoDAO.findAll();
		
	}
}
