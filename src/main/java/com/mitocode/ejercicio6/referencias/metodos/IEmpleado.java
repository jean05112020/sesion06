package com.mitocode.ejercicio6.referencias.metodos;

@FunctionalInterface
public interface IEmpleado {

	Empleado crear(String nombre, double sueldo, int edad);
}
