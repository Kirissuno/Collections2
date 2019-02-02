package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Ej7 {

	public Ej7() {
		// TODO Auto-generated constructor stub
	}

	public LinkedList <Character> uneCadenas( File cad1, File cad2 ) throws IOException {
		LinkedList <Character> listafinal = new LinkedList <>();
		
		//Lectura de los 2 ficheros y añadimos cada caracter en la lista final.
		BufferedReader input1 = new BufferedReader(new FileReader(cad1));
		String frase1 = input1.readLine();
		BufferedReader input2 = new BufferedReader(new FileReader(cad2));
		String frase2 = input2.readLine();
		
		for (int i = 0; i< frase1.length(); i++) {
			listafinal.add(frase1.charAt(i));
		}
		for (int i = 0; i<frase2.length(); i++) {
			listafinal.add(frase2.charAt(i));
		}
		
		input1.close();
		input2.close();
		
		return listafinal;
	}
	
}