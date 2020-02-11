package edu.elsmancs.bicipalma;

import java.util.ArrayList;
import java.util.List;

public class Estacion {

	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private List<Integer> anclajes = new ArrayList<Integer>();
	
	public Estacion(int id, String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes= numeroAnclajes;
	}
	
	private int getID() {
		return this.id;
	}
	
	private String getDireccion() {
		return this.direccion;
	}
	
	private int getNumAnclajes() {
		return this.numeroAnclajes;
	}
	
	@Override
	public String toString() {
		return ("id: " + getID() + "\n" + 
				"direccion: " + getDireccion() + "\n" + 
				"numeroAnclajes: " + getNumAnclajes());
	}
	
	public void consultarEstacion() {
		System.out.println(toString());
	}
	
	
}
