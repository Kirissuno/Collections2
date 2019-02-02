package collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej8 {

	public Ej8() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean clonaLista(File fich) throws IOException {
		boolean creado;
		
		BufferedReader input = new BufferedReader(new FileReader(fich));
		
		BufferedWriter out = null;
		
	    File fichero = new File("ejercicio8.txt");
	    
		out = new BufferedWriter(new FileWriter(fichero));
		out.write(input.readLine());
		
		out.close();
		input.close();
		
		BufferedReader input1 = new BufferedReader(new FileReader(fich));
		BufferedReader lectura = new BufferedReader(new FileReader(fichero));
		
		if (input1.readLine().equals(lectura.readLine())) {
			creado = true;
		}else {
			creado = false;
		}
		
		input1.close();
		lectura.close();
	    
	    return creado;
	}

}