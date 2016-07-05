package br.com.rest.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.rest.spring.mongo.Produto;
import br.com.rest.spring.mongo.ProdutoService;



@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ProdutoResource {
	
	
	ProdutoService ps = new ProdutoService();
	
	@GET
	public List<Produto> get() {
		
		return ps.getAll();
		
	}
	
	
	@POST
	public void save(Produto p){
		
		ps.save(p);
		
	}
	

}
