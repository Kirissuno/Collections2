package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ej1 {

	public Ej1() {
		// TODO Auto-generated constructor stub
	}
	
	public TreeSet <Integer> union( ArrayList <Integer> lista1, ArrayList <Integer> lista2 ){
		TreeSet <Integer> listfinal = new TreeSet <>();
		listfinal.addAll(lista1);
		listfinal.addAll(lista2);
		return listfinal;
	}

}
