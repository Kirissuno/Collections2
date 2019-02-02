package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import collections.Ej4;

public class Ej4Test {

	@Test
	public void testIncluido() {
		Ej4 ej4 = new Ej4();
		ArrayList <Integer> lista1 = new ArrayList<>();
		ArrayList <Integer> lista2 = new ArrayList<>();
		lista1.add(1);
		lista2.add(1);
		
		assertTrue( ej4.incluido(lista1, lista2) );
		
		ArrayList <Integer> lista3 = new ArrayList<>();
		lista3.add(2);
		
		assertFalse( ej4.incluido(lista1, lista3) );
		
		
	}

}
