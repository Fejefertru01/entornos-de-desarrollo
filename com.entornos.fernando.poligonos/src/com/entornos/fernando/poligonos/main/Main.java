package com.entornos.fernando.poligonos.main;

import com.entornos.fernando.poligonos.figuras.Circulo;
import com.entornos.fernando.poligonos.figuras.Rectangulo;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo(5, 10);
		Rectangulo r2= new Rectangulo();
		/*
		 * Crear un array con cinco circulos
		 * con radio aleatorio y comprobar
		 * la salida del depurador. Crearlos
		 * con un bucle. Poner el breakpoint
		 * en el FOR.
		 * 
		 */
		Circulo[] Circulos =new Circulo[5];
		
		for(int i=0; i<Circulos.length;i++) {
			Circulos[i]=new Circulo();
		}
	}

}
