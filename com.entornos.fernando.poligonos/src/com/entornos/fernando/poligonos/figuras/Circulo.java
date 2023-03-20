package com.entornos.fernando.poligonos.figuras;

import java.util.Random;

/**
 * Representa un circulo. Contiene constructores para crear un circulo dado el radio y para crear un circulo con un radio
 * aleatorio entre 1 y 10. Contiene metodos para calcular area y perimetro.
 * @version 1.0
 * @author Fernando
 */

public class Circulo {
	
int radio;

/**
 * Crea un circulo con un radio pasado por parametro.
 * 
 * @param radio es el radio que tendra el circulo
 */
public Circulo(int radio) {
	this.radio=radio;
	
}
/**
 * Crea un circulo con un circulo con un radio aleatorio entre 1 y 10
 * @see java.util.Random
 */
public Circulo() {
	Random aleatorio= new Random();
	this.radio=aleatorio.nextInt(10)+1;
}
/**
 * Devuelve el area del circulo.
 * @return devuelve el area del circulo.
 */
public double area(){
	return Math.PI*Math.pow(radio, 2);
}
/**
 * Devuelve el perimetro del circulo.
 * @return devuelve el perimetro del circulo.
 */
public double perimetro() {
	return 2*Math.PI*radio;
}
/**
 * La representacion del objeto.
 */

public String toString() {
	return "El circulo tiene un radio de "+radio+" tiene un area de "+area()+" y un perimetro de "+perimetro();
}
/**
 * Nos muestra el valor de la variable radio
 * @return Devuelve el valor de radio
 */
public int getRadio() {
	return radio;
}
/**
 * Cambia el valor de la variable radio
 * @param radio nuevo radio
 */
public void setRadio(int radio) {
	this.radio = radio;
}
}


