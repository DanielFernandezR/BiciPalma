package edu.elsmancs.tarjetausuario;

public class TarjetaUsuario {
	
	private String id = null;
	private boolean activada = false;
	
	public TarjetaUsuario(String id, boolean activada) {
		this.id = id;
		this.activada = activada;
	}
	
	public boolean getTarjetaActivada() {
		return this.activada;
	}
	
	public void setTarjetaActivada(boolean activada) {
		this.activada = activada;
	}
	
	
}
