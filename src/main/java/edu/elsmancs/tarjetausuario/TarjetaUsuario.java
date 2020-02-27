package edu.elsmancs.tarjetausuario;

public class TarjetaUsuario {

	private final String id;
	private boolean activada = false;

	public TarjetaUsuario(String id, boolean activada) {
		this.id = id;
		this.activada = activada;
	}

	public boolean isTarjetaActivada() {
		return this.activada;
	}

	public void setTarjetaActivada(boolean activada) {
		this.activada = activada;
	}

	@Override
	public String toString() {
		return this.id;
	}
}
