package modulo8;

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

import objeto.CajaDeAhorro;
import objeto.Cuenta;
import objeto.CuentaCorriente;

import org.junit.Test;

public class FiguraTest {
	//1-definicion
	  Figura  figVacia;
      Circulo cirVacia;
      Circulo cirConParametro;
      Cuadrado cuaVacia;
      Cuadrado cuaConParametros;	
      List<Figura> listFigura;
  	  Set<Figura>  setFigura;
    //2-crear objetos
    @Before  
    public void setUp() throws Exception {
        figVacia = new Circulo();
    	cirVacia = new Circulo();
    	cirConParametro = new Circulo(10,"primero",10);	
    	cuaVacia = new Cuadrado();
    	cuaConParametros = new Cuadrado(10,"cuadrado",10);
        listFigura = new ArrayList<Figura>();
		
		listFigura.add(new Circulo());
		listFigura.add(new Cuadrado());
		listFigura.add(new Circulo(11, "circulo", 11));
		listFigura.add(new Cuadrado(11, "cuadrado", 11));
		
        setFigura = new HashSet<Figura>();
		
		
		setFigura.add(new Circulo());
		setFigura.add(new Cuadrado());
		setFigura.add(new Circulo(12, "circulo",11));
		setFigura.add(new Cuadrado(12,"cuadrado", 12));
		
    }
    @After
    public void tearDown() throws Exception {
    	figVacia = null;
    	cirVacia = null;
    	cirConParametro = null ;
    	cuaVacia = null;
    	cuaConParametros = null;
    	setFigura = null;
    	listFigura = null;
    	    	
    }
    
	@Test	 
	public void testCirculoVacio() {
		assertEquals(10f, cirVacia.getMaximaSuperficie(),0.01f);
	}    
	@Test	 
	public void testCuadradoVacio() {
		assertEquals(10f, cuaVacia.getMaximaSuperficie(),0.01f);
	}    
    @Test
    public void testCirculoparametro() {
    	assertEquals(10f,cirConParametro.getRadio(),0.01f);
    }
    @Test
    public void testCuadradoParametros() {
    	assertEquals(10f,cuaConParametros.getlado(),0.01f);
    }
    @Test 
	public void testEquals_true(){
		Circulo c1 = new Circulo();
		assertTrue(cirVacia.equals(c1));
	}
    @Test 
	public void testEqualsc_true(){
		Cuadrado c2 = new Cuadrado();
		assertTrue(cuaVacia.equals(c2));
	}
   	@Test
   	public void testCalcularSuperficie(){
   		assertEquals(314,cirVacia.calcularSuperficie(),0.01f);
     	}	
    @Test
	public void testCalcularSuperficieCuadrado(){
		assertEquals(100,cuaVacia.calcularSuperficie(),0.01f);
 	}	
    @Test
	public void testListContains_true(){
		System.out.println("figVacia" + figVacia);
		System.out.println("la lista");
		System.out.println(listFigura);
		assertTrue(listFigura.contains(figVacia));
		
	}
	
	@Test
	public void testListContains_false(){
		Circulo ca = new Circulo(15, "circulo", 15);
		assertFalse(listFigura.contains(ca));
	}

	@Test
	public void testListAdd_true(){
		assertTrue(listFigura.add(new Circulo()));
	}
	@Test
	public void testSetAdd_false(){
		assertFalse(setFigura.add(new Circulo()));
	}
	
}