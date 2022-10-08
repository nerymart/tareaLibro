package dal;

import java.util.ArrayList;

import bll.Libro;

public class Autor extends Libro {
	private ArrayList<Libro> li = new ArrayList<Libro>();
	private String nombre;
	private String Pseudonimo;
	private String Nacionalidad;
	
	public Autor() {
		super();
	}
	public Autor(ArrayList<Libro> li, String nombre, String pseudonimo, String nacionalidad) {
		super();
		this.li = li;
		this.nombre = nombre;
		Pseudonimo = pseudonimo;
		Nacionalidad = nacionalidad;
	}
	public ArrayList<Libro> getLi() {
		return li;
	}
	public void setLi(ArrayList<Libro> li) {
		this.li = li;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPseudonimo() {
		return Pseudonimo;
	}
	public void setPseudonimo(String pseudonimo) {
		Pseudonimo = pseudonimo;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	
	public void mostrar() {
		
		for(int i=0; i<li.size(); i++) {
			
		}
	}
	
	
}
