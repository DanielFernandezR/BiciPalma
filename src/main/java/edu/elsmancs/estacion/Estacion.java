package edu.elsmancs.estacion;

import java.util.concurrent.ThreadLocalRandom;

import edu.elsmancs.bicicleta.Bicicleta;
import edu.elsmancs.tarjetausuario.TarjetaUsuario;

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
		int posicionLista = 0;
		int numAnclaje = posicionLista + 1;
		boolean biciAnclada = false;
		
		while (biciAnclada == false) {
			
			if(this.anclajes[posicionLista] == null) {
				this.anclajes[posicionLista] = bicicleta;
				mostrarAnclaje(bicicleta, numAnclaje);
				biciAnclada = true;
			}else { 
					posicionLista ++;
					numAnclaje ++;	
				}
		}
	}
	
	public void consultarAnclajes() {
		int posicion = 0;
		int numAnclaje = 0;
		for (Bicicleta anclaje:this.anclajes) {
			numAnclaje = posicion + 1;
			if (anclaje == null) {
				System.out.println("Anclaje " + numAnclaje + " libre");
				posicion ++;
			}
			else {
				System.out.println("Anclaje " + numAnclaje + " " + this.anclajes[posicion].getId());
				posicion ++;
			}
		}
	}
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.getTarjetaActivada();
		}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		if(leerTarjetaUsuario(tarjetaUsuario)) {
			
			boolean biciRetirada = false;
			
			while(biciRetirada != true) {
				int posicion = generarAnclaje();
				int numAnclaje = posicion + 1;
				if(this.anclajes[posicion] != null) {
					mostrarBicicleta(this.anclajes[posicion], numAnclaje);
					this.anclajes[posicion] = null;
					biciRetirada = true;
					}else;
			}
		}
	}
	
	void mostrarAnclaje(Bicicleta bicicleta, int numAnclaje) {
		System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + numAnclaje);
	}
	
	void mostrarBicicleta(Bicicleta bicicleta, int numAnclaje) {
		System.out.println("Bicicleta retirada: " + bicicleta.getId() + " del anclaje: " + numAnclaje);
	}
	
	public int generarAnclaje() {
		Integer numRandomAnclaje = ThreadLocalRandom.current().nextInt(0, this.anclajes.length);
		return numRandomAnclaje;
	}
	
}

