package com.mitocode.ejercicio8.supplier;

import java.util.function.Supplier;

public class Programa {
	
	public static void main(String[] args) {
		ISupplier<String> is = () -> "dany";
		String nombre = is.get();
		System.out.println("nombre: " + nombre);
		
		
		ISupplier<Integer> is2 = () -> 10;
		int Edad = is2.get();
		System.out.println("edad: " + Edad);
		
		//usando la interface supplier de java 8 
		Supplier<String> is3 = () -> "dany";
		nombre = is.get();
		System.out.println("nombre: " + nombre);
		
		
		Supplier<Integer> is4 = () -> 10;
		Edad = is2.get();
		System.out.println("edad: " + Edad);
		
		Supplier<Double> is5 = () -> Math.PI;
		double valor =  is5.get();
		System.out.println("Valor de pi " + valor);
		
	}
}
