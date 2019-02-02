package testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.junit.Test;

import collections.Ej7;

public class Ej7Test {

	@Test
	public void testUneCadenas() throws IOException {
		LinkedList <Character> listafinal = new LinkedList <>();
		Ej7 ej7 = new Ej7();
		
		//Creación del primer fichero a testear
		BufferedWriter out1 = null;
	    File fichero1 = new File("test2.txt");
	    out1 = new BufferedWriter(new FileWriter(fichero1));
		out1.write("Hola");
		out1.close();
		
		//Creación del segundo fichero a testear
		BufferedWriter out2 = null;
	    File fichero2 = new File("test3.txt");
	    out2 = new BufferedWriter(new FileWriter(fichero2));
		out2.write("Cacacola");
		out2.close();
		
		//Lectura y escritura de cada carácter de los 2 ficheros en la lista final.
		BufferedReader input1 = new BufferedReader(new FileReader(fichero1));
		String frase1 = input1.readLine();
		BufferedReader input2 = new BufferedReader(new FileReader(fichero2));
		String frase2 = input2.readLine();
		
		for (int i = 0; i< frase1.length(); i++) {
			listafinal.add(frase1.charAt(i));
		}
		for (int i = 0; i<frase2.length(); i++) {
			listafinal.add(frase2.charAt(i));
		}
		
		input1.close();
		input2.close();
		
		//Ejecutando el test
		assertEquals(listafinal, ej7.uneCadenas(fichero1, fichero2) );
	}

}
