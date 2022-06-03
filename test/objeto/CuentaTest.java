package objeto ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objeto.excepciones.SaldoInsuficienteException;

public class CuentaTest {
	//lete de pruebas
	//1- definicion
	Cuenta cueVacia;
	Cuenta cueConParametros;
	
	CajaDeAhorro caVacia;
	CajaDeAhorro caConParametrios;
	
	CuentaCorriente ccVacia;
	CuentaCorriente ccConParametros;
	
	List<Cuenta> listCuentas;
	Set<Cuenta> setCuentas;
	
	
	@Before
	public void setUp() throws Exception {
		//2- se crean los objetos
		cueVacia = new CajaDeAhorro();
		cueConParametros = new CajaDeAhorro(200, 200.50f, 2.3f);
		//2
		//cajas de ahorro
		caVacia = new CajaDeAhorro();
		caConParametrios = new CajaDeAhorro(15, 150, 8.3f);
		//una lista es ordered  , uno a continuacion del otro
		//4
		ccVacia = new CuentaCorriente();
		ccConParametros = new CuentaCorriente(20,2000.50f, 3000);
		//6
		//permite duplicados
		listCuentas = new ArrayList<Cuenta>();
		
		listCuentas.add(new CajaDeAhorro());
		listCuentas.add(new CuentaCorriente());
		listCuentas.add(new CajaDeAhorro(101, 1000, 3.3f));
		listCuentas.add(new CuentaCorriente(202, 2000, 5000));
		//10
		
		//unordered / se colocan de cualquier manera
		//es unica /equals y hashcode
		setCuentas = new HashSet<Cuenta>();
		
		
		setCuentas.add(new CajaDeAhorro());
		setCuentas.add(new CuentaCorriente());
		setCuentas.add(new CajaDeAhorro(101, 1000, 3.3f));
		setCuentas.add(new CuentaCorriente(202, 2000, 5000));
		//14
		
	}

	@After
	public void tearDown() throws Exception {
		cueVacia = null;
		cueConParametros = null;
		
		caVacia = null;
		caConParametrios = null;
		listCuentas =null;
		setCuentas = null;
		
		Cuenta.vaciarContador();
		
		
	}

	@Test
	public void testCueVaciaNumero() {
		assertEquals(100, cueVacia.getNumero());
	}
	@Test
	public void testCueVaciaSaldo(){
		assertEquals(100, cueVacia.getSaldo(), 0.001);
	}
	@Test
	public void testEquals_true(){
		Cuenta c1 = new CajaDeAhorro();
		assertTrue(cueVacia.equals(c1));
	}
	
	@Test
	public void testEquals_false(){
		Cuenta c1 = new CajaDeAhorro(45,45,2.3f);
		assertFalse(cueVacia.equals(c1));
	}

	@Test
	public void testEquals_falseOtroObjeto(){
		String s = new String("hola");
		assertFalse(cueVacia.equals(s));
	}
	
	@Test
	public void testEquals_falsenull(){
		assertFalse(cueVacia.equals(null));
	}
	
	@Test
	public void testCajaDeAhorroVacia_interes(){
		assertEquals(10, ((CajaDeAhorro)caVacia).getInteres(),0.001);
	}
	@Test
	public void testCajaDeAhorroEquals_true(){
	   Cuenta ca1= new CajaDeAhorro();
	   assertTrue(caVacia.equals(ca1));
	}
	@Test
	public void testCajaDeAhorroEquals_false(){
	   Cuenta ca1= new CajaDeAhorro(1,1,3);
	   assertFalse(caVacia.equals(ca1));
	}
	@Test
	public void testListContains_true(){
		System.out.println("cueVacia" + cueVacia);
		System.out.println("la lista");
		System.out.println(listCuentas);
		assertTrue(listCuentas.contains(cueVacia));
		
	}
	
	@Test
	public void testListContains_false(){
		CajaDeAhorro ca = new CajaDeAhorro(123, 123, 123);
		assertFalse(listCuentas.contains(ca));
	}

	@Test
	public void testListAdd_true(){
		assertTrue(listCuentas.add(new CajaDeAhorro()));
	}
	@Test
	public void testSetAdd_false(){
		assertFalse(setCuentas.add(new CajaDeAhorro()));
	}
	
	@Test
	public void testCajaDeahooAcreditar(){
		caVacia.acreditar(50);
		assertEquals(150, caVacia.getSaldo(),0.001);
		
	}
	@Test
	public void testCajaDeAhorro_debicarAlcanza(){
		try {
			caVacia.debitar(80);
			assertEquals(20, caVacia.getSaldo(),0.001);
		} catch (SaldoInsuficienteException e) {
			//pintarlo de rojoj
			assertTrue(false);
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testCajaDeAhorro_debitarNOAlcanza(){
		try {
			caVacia.debitar(500);
			assertTrue(false); //lo pinta de rojo
		} catch (SaldoInsuficienteException e) {
			assertEquals(100, caVacia.getSaldo(),0.001);
			e.printStackTrace();
		}
		
		
	}
	@Test
	public void testCuentaCorrienteAlcanzaConDEscubierto(){
		//saldo 100
		//descubierto 1000
		try {
			ccVacia.debitar(300);
			assertEquals(-200, ccVacia.getSaldo(),0.001);
		} catch (SaldoInsuficienteException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		
	}
	@Test
	public void testCantidadDeObjetosCreados(){
		assertEquals(14, Cuenta.getCantidadDeCuentas());
	}
	@Test
	public void testIsEmptyCajaDeAhoor_true(){
		caVacia.setNumero(0);
		caVacia.setSaldo(0);
		caVacia.setInteres(0);
		assertTrue(caVacia.isEmpty());
	}
	@Test
	public void testIsEmptyCajaDeAhorro_false(){
		assertFalse(caVacia.isEmpty());
	}
	
}
