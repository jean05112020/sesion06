package com.mitocode.ejercicio6.referencias.metodos;

public class Programa2 {
	public static void main(String[] args) {
		//clase anonima
		IEmpleado iemp = new IEmpleado() {
			
			@Override
			public Empleado crear(String nombre, double sueldo, int edad) {
				
				return new Empleado(nombre, sueldo, edad);
			}
		};
		
		Empleado e1 = iemp.crear("jean", 1200.0, 20);
		System.out.println(e1);
		
		//usando expression lambda
		IEmpleado iemp2 = (nombre,sueldo,edad) -> new Empleado(nombre,sueldo,edad);
		Empleado e2=iemp2.crear("jean" ,1200, 22);
		System.out.println(e2);
		
		//usando referencia de metodos
		IEmpleado iemp3 = Empleado::new;
		Empleado e3 = iemp3.crear("paul", 1500.0, 20);
		System.out.println(e3);
	}
}
