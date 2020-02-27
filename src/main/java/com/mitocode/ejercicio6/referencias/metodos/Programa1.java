package com.mitocode.ejercicio6.referencias.metodos;

import java.util.Arrays;

public class Programa1 {
	
	static void referenciaMetodoStatic() {
		System.out.println("Metodo static");
	}
	

	public static void main(String[] args) {

		IOperacion op1 = () -> {
			int x = 5;
			int y = 3;
			System.out.println("# hojas impresas: "+ (x + y));
		};
		op1.imprimir();
		
		// Referenciar a un metodo static, tiene q ser sin parametros
		IOperacion op2 = () -> Programa1.referenciaMetodoStatic();
		op2.imprimir();
		
		// Simplificado
		IOperacion op3 = Programa1::referenciaMetodoStatic;
		op3.imprimir();
		
		
		
		String[] colores = {"negro","amarillo","verde","azul","violeta"};
		System.out.println("colores");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		
		// esto :: sirve para identificar q son metodos de referencia
		Arrays.sort(colores, String::compareToIgnoreCase);
		System.out.println("\ncolores ordenados");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		
	}

}
