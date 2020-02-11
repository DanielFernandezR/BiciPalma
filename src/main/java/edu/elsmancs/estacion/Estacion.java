package edu.elsmancs.estacion;

import edu.elsmancs.bicicleta.Bicicleta;

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
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		int posicion = 0;
		int numAnclaje = posicion + 1;
		for (Bicicleta anclaje:this.anclajes) {
			if (anclaje == null) {
				this.anclajes[posicion] = bicicleta;
				mostrarAnclaje(bicicleta, numAnclaje);
				break;
			}
			else 
				posicion ++;
				numAnclaje ++;
				
			}
		}
	
	public void consultarAnclajes() {
		int posicion = 0;
		int numAnclaje = posicion + 1;
		for (Bicicleta anclaje:this.anclajes) {
			if (anclaje == null) {
				System.out.println("Anclaje " + numAnclaje + " libre");
				posicion ++;
				numAnclaje ++;
			}
			else {
				System.out.println("Anclaje " + numAnclaje + " " + anclaje.getId());
				posicion ++;
				numAnclaje ++;
			}
	}
	}
	
	void mostrarAnclaje(Bicicleta bicicleta, int numAnclaje) {
		System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + numAnclaje);
	}
	}

