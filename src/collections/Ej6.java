package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Ej6 {

	public Ej6() {
		// TODO Auto-generated constructor stub
	}
	
	public LinkedList <Character> leeCadena( File fichero  ) throws IOException {
		LinkedList <Character> listafinal = new LinkedList <>();
		
		BufferedReader input = new BufferedReader(new FileReader(fichero));
		String frase = input.readLine();
		
		for (int i = 0; i< frase.length(); i++) {
			listafinal.add(frase.charAt(i));
		}
		
		input.close();
		
		return listafinal;
	}

}