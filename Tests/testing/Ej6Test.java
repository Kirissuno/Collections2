package testing;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.junit.Test;

import collections.Ej6;

public class Ej6Test {

	@Test
	public void testLeeCadena() throws IOException {
		LinkedList <Character> listafinal = new LinkedList <>();
		Ej6 ej6 = new Ej6();
	    BufferedWriter output = null;
	    File fich = new File("test1.txt");
	
		output = new BufferedWriter(new FileWriter(fich));
		output.write("Prueba");
		output.close();
	
		BufferedReader input = new BufferedReader(new FileReader(fich));
		String frase = input.readLine();
		
		for (int i = 0; i< frase.length(); i++) {
			listafinal.add(frase.charAt(i));
		}
		
		input.close();
		
		assertEquals(listafinal, ej6.leeCadena(fich));
		
	}

}
