/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ec.edu.espol.workshops;
import static org.junit.Assert.*;
import org.junit.Test;

public class BranchCoverageTest {
	
	@Test public void testLIC01() {
   	 Cliente cliente = new Cliente(18,Sexo.Femenino,EstadoCivil.Casado);
	    Prima prima = new Prima(cliente);
		assertEquals(-1,prima.calcularPrima(false));
    }
	
	@Test public void testAGE01() {
	   	 Cliente cliente = new Cliente(80,Sexo.Femenino,EstadoCivil.Casado);
		    Prima prima = new Prima(cliente);
			assertEquals(-1,prima.calcularPrima(true));
	}

	/**
	 *	(F) No tiene licencia 
	 *	(F) Edad > 80
	 *  (F) EstadoCivil = Casado || Sexo = Femenino
	 *	(F) Edad >= 45 && Edad() < 65
	 *	(F) Sexo = Masculino && EstadoCivil = Soltero && Edad < 25
	 */		
	@Test
	public void testCMB01() {
		Cliente cliente = new Cliente(30,Sexo.Masculino,EstadoCivil.Soltero);
	    Prima prima = new Prima(cliente);
		assertEquals(500,prima.calcularPrima(true));
	}
	
	/**
	 *	(F) No tiene licencia 
	 *	(F) Edad > 80
	 *  (T) EstadoCivil = Casado || Sexo = Femenino
	 *	(T) Edad >= 45 && Edad() < 65
	 *	(F) Sexo = Masculino && EstadoCivil = Soltero && Edad < 25
	 */	
	@Test public void testCMB02() {
		 Cliente cliente = new Cliente();
		 cliente.setEdad(50);
		 cliente.setEstadoCivil(EstadoCivil.Casado);
		 cliente.setSexo(Sexo.Masculino);
		 Prima prima = new Prima(cliente);
		 assertEquals(200,prima.calcularPrima(true));
   }
	
	/**
	 *	(F) No tiene licencia 
	 *	(F) Edad > 80
	 *  (F) EstadoCivil = Casado || Sexo = Femenino
	 *	(F) Edad >= 45 && Edad() < 65
	 *	(T) Sexo = Masculino && EstadoCivil = Soltero && Edad < 25
	 */	
	@Test 
	public void testCMB03() {
	   	 Cliente cliente = new Cliente(20,Sexo.Masculino,EstadoCivil.Soltero);
		 Prima prima = new Prima(cliente);
		 assertEquals(2000,prima.calcularPrima(true));
    }
	
	/**
	 *	(F) No tiene licencia 
	 *	(F) Edad > 80
	 *  (T) EstadoCivil = Casado || Sexo = Femenino
	 *	(F) Edad >= 45 && Edad() < 65
	 *	(F) Sexo = Masculino && EstadoCivil = Soltero && Edad < 25
	 */	
	@Test 
	public void testCMB04() {
	   	 Cliente cliente = new Cliente(20,Sexo.Masculino,EstadoCivil.Casado);
		    Prima prima = new Prima(cliente);
			assertEquals(300,prima.calcularPrima(true));
	}
	
	/**
	 *	(F) No tiene licencia 
	 *	(F) Edad > 80
	 *  (F) EstadoCivil = Casado || Sexo = Femenino
	 *	(T) Edad >= 45 && Edad() < 65
	 *	(F) Sexo = Masculino && EstadoCivil = Soltero && Edad < 25
	 */	
	@Test public void testCMB05() {
   	Cliente cliente = new Cliente(50,Sexo.Masculino,EstadoCivil.Soltero);
	    Prima prima = new Prima(cliente);
		assertEquals(400,prima.calcularPrima(true));
   }

	@Test public void testCMB06() {
	   	 Cliente cliente = new Cliente(79,Sexo.Femenino,EstadoCivil.Soltero);
		    Prima prima = new Prima(cliente);
			assertEquals(300,prima.calcularPrima(true));
	}
	
}
