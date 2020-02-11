package edu.elsmancs.bicipalma;

public class Estacion {

	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = null; 
	
	public Estacion(int id, String direccion, int anclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes= anclajes;
		this.anclajes = new Bicicleta[anclajes];
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

	
	public void consultarEstacion() {
		System.out.println("id: " + getID());
		System.out.println("direccion: " + getDireccion());
		System.out.println("numeroAnclajes: " + getNumAnclajes());
	}
	
	public int anclajesLibres() {
		int numAnclajesLibres = 0;
		for (Bicicleta anclaje:this.anclajes){
			if (anclaje == null) {
				numAnclajesLibres += 1;
			} else
				;
		}
		return numAnclajesLibres;
	}
}