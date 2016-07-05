package br.com.rest.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.rest.spring.mongo.Endereco;
import br.com.rest.spring.mongo.Usuario;


@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {
	
	
	
	@GET
	@Path("/login/{texto}")
	public List<Usuario> getByLogin() {
		return es.getByLocationWithin();

}
