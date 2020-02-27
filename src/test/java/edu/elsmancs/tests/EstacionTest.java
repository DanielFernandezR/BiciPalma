package edu.elsmancs.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.elsmancs.bicicleta.Bicicleta;
import edu.elsmancs.estacion.Estacion;
import edu.elsmancs.tarjetausuario.TarjetaUsuario;

public class EstacionTest {

	Estacion prueba = new Estacion(20, "Mi casa", 13);

	@Test
	public void consultarEstacionTest() {
		assertEquals(20, prueba.getID());
		assertEquals("Mi casa", prueba.getDireccion());
		assertEquals(13, prueba.getNumAnclajes());
	}

	@Test
	public void anclajesLibresTest() {
		assertEquals(13, prueba.anclajesLibres());
	}

	@Test
	public void anclarBicicletaTest() {
		int[] bicicletas = { 22, 12, 33, 44, 200, 2111, 82 };
		for (int id : bicicletas) {
			Bicicleta bicicleta = new Bicicleta(id);
			prueba.anclarBicicleta(bicicleta);
		}
		assertEquals(6, prueba.anclajesLibres());
	}

	@Test
	public void consultarAnclajesTest() {
		int[] bicicletas = { 22, 12, 33, 44, 200, 2111, 82 };
		for (int id : bicicletas) {
			Bicicleta bicicleta = new Bicicleta(id);
			prueba.anclarBicicleta(bicicleta);
		}
		prueba.consultarAnclajes();
	}

	@Test
	public void leerTarjetaUsuarioTest() {
		TarjetaUsuario tarjeta = new TarjetaUsuario("519874165164", false);
		assertEquals(false, prueba.leerTarjetaUsuario(tarjeta));
	}

	@Test
	public void retirarBicicletaTest() {
		int[] bicicletas = { 22, 12, 33, 44, 200, 2111, 82 };
		TarjetaUsuario tarjeta = new TarjetaUsuario("519874165164", true);
		for (int id : bicicletas) {
			Bicicleta bicicleta = new Bicicleta(id);
			prueba.anclarBicicleta(bicicleta);
		}
		prueba.retirarBicicleta(tarjeta);
		assertEquals(7, prueba.anclajesLibres());
	}
}
