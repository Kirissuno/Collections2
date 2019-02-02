package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import collections.Ej2;
import collections.Ej3;
import collections.Ej4;
import collections.Ej5;
import collections.Ej6;
import collections.Ej7;
import collections.Ej8;
import collections.Ej1;

public class Main {

	public static void main(String[] args) {
		ArrayList <Integer> lista1 = new ArrayList<>();
		ArrayList <Integer> lista2 = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			lista1.add( (int) (Math.random()*10) );
			lista2.add( (int) (Math.random()*10) );
		}
		
		//Ejercicio 1
		System.out.println("Union");
		System.out.println("-----------");
		Ej1 ej1 = new Ej1();
		System.out.println(ej1.union(lista1, lista2)+"\n");
		
		//Ejercicio 2
		System.out.println("Interseccion");
		System.out.println("-----------");
		Ej2 ej2 = new Ej2();
		if ( ej2.interseccion(lista1, lista2).size() > 0 ) {
			System.out.println(ej2.interseccion(lista1, lista2)+"\n");
		}else {
			System.out.println("No se han repetido números"+"\n");
		}
		
		//Ejercicio 3
		System.out.println("Diferencia");
		System.out.println("-----------");
		Ej3 ej3 = new Ej3();
		if ( ej3.diferencia(lista1, lista2).size() > 0 ) {
			System.out.println(ej3.diferencia(lista1, lista2)+"\n");
		}else {
			System.out.println("No se han repetido números"+"\n");
		}
		
		//Ejercicio 4
		System.out.println("Incluido");
		System.out.println("-----------");
		Ej4 ej4 = new Ej4();
		
		//Reiniciar listas para comprobar;
//		lista1.clear();
//		lista1.add(1);
//		lista2.clear();
//		lista2.add(1);
		
		if (ej4.incluido(lista1, lista2)) {
			System.out.println("Todos se repiten"+"\n");
		}else {
			System.out.println("No se repiten TODOS"+"\n");
		}
		
		
		//Ejercicio 5
		System.out.println("Fusion");
		System.out.println("-----------");
		Ej5 ej5 = new Ej5();
		
		System.out.println(ej5.diferencia(lista1, lista2)+"\n");
		
		//Ejercicio 6
		System.out.println("leeFichero");
		System.out.println("-----------");
		Ej6 ej6 = new Ej6();
		String text = "See you late aligator";
	    BufferedWriter output = null;
	    File fich = new File("frase.txt");
		
		try {
			
			output = new BufferedWriter(new FileWriter(fich));
			output.write(text);
			output.close();
			
			System.out.println(ej6.leeCadena(fich)+"\n");
		
		}catch(FileNotFoundException e) {
			System.out.println("No exite el fichero \n");
		}catch(IOException e) {
			System.out.println("No se puede leer \n");
		}
		
		
		
		
		//Ejercicio 7
		System.out.println("uneFicheros");
		System.out.println("-----------");
		Ej7 ej7 = new Ej7();
		String text2 = "After a while crocodile";
	    BufferedWriter out = null;
	    File fichero = new File("frase2.txt");
		
		try {
			
			out = new BufferedWriter(new FileWriter(fichero));
			out.write(text2);
			out.close();
			
			System.out.println(ej7.uneCadenas(fich, fichero)+"\n");
		
		}catch(FileNotFoundException e) {
			System.out.println("No exite el fichero \n");
		}catch(IOException e) {
			System.out.println("No se puede leer \n");
		}
		
		
		
		//Ejercicio 8
		System.out.println("clonaFicheros");
		System.out.println("-----------");
		Ej8 ej8 = new Ej8();
		
		try {
			if (ej8.clonaLista(fich)) {
				System.out.println("Clonado correctamente");
			}else {
				System.out.println("ERROR.");
			}
		}catch (IOException e) {
			System.out.println("Fichero inexistente o no se puede leer");
		}
	}

}
