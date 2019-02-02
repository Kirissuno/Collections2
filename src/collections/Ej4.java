package collections;

import java.util.ArrayList;

public class Ej4 {

	public Ej4() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean incluido( ArrayList <Integer> lista1, ArrayList <Integer> lista2 ){
		boolean full = false;
		if ( lista2.containsAll(lista1) ) {
			full = true;
		}
		return full;
	}  

}
