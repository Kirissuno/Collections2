package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

import collections.Ej2;

public class Ej2Test {

	@Test
	public void testInterseccion() {
		Ej2 ej2 = new Ej2();
		TreeSet <Integer> listfinal = new TreeSet <>();
		ArrayList <Integer> lista1 = new ArrayList<>();
		ArrayList <Integer> lista2 = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			lista1.add( (int) (Math.random()*10) );
			lista2.add( (int) (Math.random()*10) );
		}
		
		for ( int num1 : lista1  ) {
			if ( lista2.contains(num1) ) {
				listfinal.add(num1);
			}
		}
		
		assertEquals(listfinal, ej2.interseccion(lista1, lista2));
		
	}

}
