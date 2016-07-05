package br.com.rest.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.rest.util.SpringUtil;

public class ProdutoService {
	
	
	private ProdutoRepository pdao;
	
	public ProdutoService() {
		// TODO Auto-generated constructor stub		
		ApplicationContext context =SpringUtil.getContext();
		pdao =  context.getBean(ProdutoRepository.class);
		//edaoC = new EnderecoRepositoryCustomImpl();
	}
	
	public List<Produto> getAll(){
		
		return pdao.findAll();
	}
	

	public void save(Produto p) {
		// TODO Auto-generated method stub
		pdao.save(p);
	}
}
