package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ej3 {

	public Ej3() {
		// TODO Auto-generated constructor stub
	}
	
	public TreeSet <Integer> diferencia( ArrayList <Integer> lista1, ArrayList <Integer> lista2 ){
		TreeSet <Integer> listfinal = new TreeSet <>();
		for ( int num1 : lista1  ) {
			if ( !lista2.contains(num1) ) {
				listfinal.add(num1);
			}
		}
		return listfinal;
	} 

}