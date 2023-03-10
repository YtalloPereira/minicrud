package br.edu.ifpb.dac.minicrud;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.edu.ifpb.dac.minicrud.controller.ProdutoController;
import br.edu.ifpb.dac.minicrud.model.Produto;

@SpringBootApplication
public class MinicrudApplication implements CommandLineRunner {
	
	@Autowired
	private ProdutoController produtoController;

	public static void main(String[] args) {
		SpringApplication.run(MinicrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("\n1 - Adicionar Produto \n2 - Listar todos os produtos \n3 - sair");
		int entrada = Integer.parseInt(leitor.nextLine());
		
		while(entrada != 3) {
			if(entrada == 1) {
				System.out.println("Insira os atributos do produto ");
				System.out.println("Categoria: ");
				String categoria = leitor.nextLine();
				System.out.println("Descrição: ");
				String descricao = leitor.nextLine();
				System.out.println("Preço: ");
				long preco = Long.parseLong(leitor.nextLine());
				Produto novoProduto = new Produto(preco, categoria, descricao);
				produtoController.create(novoProduto);
			}else if(entrada == 2) {
				Iterable<Produto> todosOsProdutos = produtoController.listAll();
				for (Produto produto : todosOsProdutos) {
					System.out.println(produto.toString());
					System.out.println("--------------------------------------------------------");
				}
			}
			System.out.println("\n1 - Adicionar Produto \n2 - Listar todos os produtos \n3 - sair");
			entrada = Integer.parseInt(leitor.nextLine());
		}
		
		leitor.close();
	}

}
