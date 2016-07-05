package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.query.Criteria;

import br.com.herbertrausch.util.SpringUtil;


public class UsuarioService {
	
	private UsuarioRepository udao;
	private UsuarioRepositoryCustomImpl udaoC;
	
	public UsuarioService(){
		
		ApplicationContext context =SpringUtil.getContext();
		udao 	=  context.getBean(UsuarioRepository.class);
		udaoC = new UsuarioRepositoryCustomImpl();
		
	}
	
	public List<Usuario> getAll(){
		
		return udao.findAll();
	}
	
	public void insert(Usuario u){
		udao.save(u);
	}
	
	public void updateByQuery(String campo, String busca, String valor){
		udaoC.findAndUpdate(Criteria.where(campo).is(busca), campo, valor);
	}
	
	

}
