package collections;

import java.util.ArrayList;

public class Ej5 {

	public Ej5() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList <Integer> diferencia( ArrayList<Integer> lista1, ArrayList <Integer> lista2 ){
		ArrayList<Integer> listafinal = new ArrayList<>();
		listafinal.addAll(lista1);
		listafinal.addAll(lista2);
		return listafinal;
	}

}

