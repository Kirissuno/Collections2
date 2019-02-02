package testing;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import collections.Ej5;

public class Ej5Test {

	@Test
	public void testDiferencia() {
		Ej5 ej5 = new Ej5();
		ArrayList<Integer> listafinal = new ArrayList<>();
		ArrayList <Integer> lista1 = new ArrayList<>();
		ArrayList <Integer> lista2 = new ArrayList<>();
		lista1.add(1);
		lista1.add(2);
		lista2.add(3);
		lista2.add(3);
		
		listafinal.addAll(lista1);
		listafinal.addAll(lista2);
		
		assertEquals(listafinal, ej5.diferencia(lista1, lista2));
	}

}
