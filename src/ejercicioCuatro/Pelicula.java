/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCuatro;

import java.util.Comparator;

/**
 *
 * @author leand
 */
public class Pelicula {
    
    private String titulo;
    
    private String director;
    
    private Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
	this.titulo = titulo;
	this.director = director;
	this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getDirector() {
	return director;
    }

    public void setDirector(String director) {
	this.director = director;
    }

    public Double getDuracion() {
	return duracion;
    }

    public void setDuracion(Double duracion) {
	this.duracion = duracion;
    } 
    
    public static Comparator<Pelicula> compararDuracionDesc = new Comparator<Pelicula>() {
	
	@Override
	
	public int compare(Pelicula t, Pelicula t1) {
	    
	    return t1.getDuracion().compareTo(t.getDuracion());
	    
	}
    };
	
    public static Comparator<Pelicula> compararDuracionAsc = new Comparator<Pelicula>() {
	
	@Override
	
	public int compare(Pelicula t, Pelicula t1) {
	    
	    return t.getDuracion().compareTo(t1.getDuracion());
	    
	}
    };

    public static Comparator<Pelicula> compararNombreAsc = new Comparator<Pelicula>(){

	@Override

	public int compare(Pelicula t, Pelicula t1) {

	    return t.getTitulo().compareTo(t1.getTitulo());
	    
	}
	
    };
    
    public static Comparator<Pelicula> compararDirectorAsc = new Comparator<Pelicula>(){
	
	@Override
	
	public int compare(Pelicula t, Pelicula t1) {

	    return t.getDirector().compareTo(t1.getDirector());

	}
	
    };

}
