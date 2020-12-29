/**
 * 
 */
package dev.vsuarez.exam.api.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dev.vsuarez.exam.component.IGeometricFigure;

import dev.vsuarez.exam.figure.Circle;
import dev.vsuarez.exam.figure.Square;
import dev.vsuarez.exam.figure.Triangle;

/**
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
@Path("/figService")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class FiguresService {
	
	private static List<IGeometricFigure> figures = new ArrayList<>();
	
	static {
		figures.add(new Circle(new BigDecimal(15), 1));
		figures.add(new Circle(new BigDecimal(23), 2));
		
		figures.add(new Triangle(new BigDecimal(15), new BigDecimal(18), 3));
		figures.add(new Triangle(new BigDecimal(75), new BigDecimal(22), 4));
		
		figures.add(new Square(new BigDecimal(56), 5));
		figures.add(new Square(new BigDecimal(12), 6));
	}
	
	@GET
	public Response findAllFigures() {
		return Response.ok(FiguresService.figures).build();
	}
	
	@POST
	public Response createFigure(IGeometricFigure figureReq) {
		figureReq.setID(figures.size()+1);
		FiguresService.figures.add(figureReq);
		return Response.ok(figureReq).build();
	}
	
	@PUT
	public Response updateUser(IGeometricFigure figureReq) {
		List<IGeometricFigure> found = FiguresService.figures.stream().filter(x -> figureReq.getName() == x.getName())
				.collect(Collectors.toList());
		
		if(found.isEmpty()) 
			return Response.status(Status.BAD_REQUEST).entity("Figura no Encontrada").build();
		
		IGeometricFigure updateFigure = found.get(0);
		updateFigure.setBase(figureReq.getBase());
		updateFigure.setDiameter(figureReq.getDiameter());
		updateFigure.setHeight(figureReq.getHeight());
		updateFigure.setSurface(figureReq.getArea());
		return Response.ok(updateFigure).build();
	}
	
	@DELETE
	@Path("{figureName}")
	public Response deleteUser( @PathParam("figureName") String name) {
		System.out.println("figureName ==> " + name);
		List<IGeometricFigure> found = FiguresService.figures.stream().filter(x -> name.equals(x.getName()))
				.collect(Collectors.toList());
		
		if(found.isEmpty()) 
			return Response.status(Status.BAD_REQUEST).entity("Figura no Encontrada").build();
		
		IGeometricFigure updateFigure = found.get(0);
		FiguresService.figures.remove(updateFigure);
		return Response.noContent().build();
	}
	
	@HEAD
	public Response pingFiguresService() {
		return Response.noContent().header("running", true).build();
	}

}
