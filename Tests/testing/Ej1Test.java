package testing;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

import collections.Ej1;

public class Ej1Test {

	@Test
	public void testUnion() {
		Ej1 ej1 = new Ej1();
		ArrayList <Integer> lista1 = new ArrayList<>();
		ArrayList <Integer> lista2 = new ArrayList<>();
		
		lista1.add(1);
		lista2.add(2);
		
		TreeSet <Integer> listfinal = new TreeSet<>();
		listfinal.addAll(lista1);
		listfinal.addAll(lista2);
		
		assertEquals(listfinal, ej1.union(lista1, lista2));
	}

}
