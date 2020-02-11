package edu.elsmancs.estacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EstacionTest {
	
	private Estacion prueba;
	
	@Before
	public void Setup() {
		Estacion prueba = new Estacion(3000, "El de al lao mi casa", 20);
	}
	
	@Test
	public void consultarEstacionTest() {
		
	}

}
