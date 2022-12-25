/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCuatro;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class PeliculaService {
    
    static Scanner read = new Scanner (System.in).useDelimiter("\n");

    public Pelicula datos(){
	
	Pelicula pelicula = new Pelicula();
	
	System.out.println("Digite el nombre de la pelicula");
	
	pelicula.setTitulo(read.next());
	
	System.out.println("Digite el director de la pelicula");
	
	pelicula.setDirector(read.next());
	
	System.out.println("Digite la duracion ( en horas ) de la pelicula");
	
	pelicula.setDuracion(read.nextDouble());
	
	return pelicula;
    }

    public void mostrarPeliculas (List<Pelicula> peliculas){

	for (Pelicula pelicula : peliculas) {
	 
	    System.out.println(pelicula.getTitulo());
	    
	}
    }
    
    public void peliculasMayor1Hora(List<Pelicula> peliculas){

	System.out.println("PELICULAS CON DURACION MAYOR A 1 HORA");
	
	System.out.println("");
	
	for (Pelicula pelicula : peliculas) {
	    
	    if(pelicula.getDuracion() > 1){
		
		System.out.println(pelicula.getTitulo());
		
	    }	
	    
	}
	
	
    }
 
    public void ordenDuracionDesc(List<Pelicula> peliculas){
	
	System.out.println("Orden de duracion de forma descendente");
	
	peliculas.sort(Pelicula.compararDuracionDesc);
	
	mostrarPeliculas(peliculas);
	
    }
   
    public void ordenDuracionAsc(List<Pelicula> peliculas){
	
	System.out.println("Orden de duracion de forma ascendente");
	
	peliculas.sort(Pelicula.compararDuracionAsc);
	
	mostrarPeliculas(peliculas);
	
    }
    
    public void ordenNombreAsc(List<Pelicula> peliculas){
	
	System.out.println("Orden de titulos de forma ascendente");
	
	peliculas.sort(Pelicula.compararNombreAsc);
	
	mostrarPeliculas(peliculas);
		
    }
    
    public void ordenDirectorAsc(List<Pelicula> peliculas){
	
	System.out.println("Orden de directores de forma ascendente");
	
	peliculas.sort(Pelicula.compararDirectorAsc);
	
	mostrarPeliculas(peliculas);
		
	
    }
    
}
