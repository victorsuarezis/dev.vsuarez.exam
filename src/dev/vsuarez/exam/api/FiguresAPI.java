/**
 * 
 */
package dev.vsuarez.exam.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
@Path("/figures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FiguresAPI {
	
	@GET
	public Response figures() {
		return Response.ok("API para obtener figuras: Circulo, Triangulo y Cuadrado", MediaType.APPLICATION_JSON).build();
	}
	
	

}
