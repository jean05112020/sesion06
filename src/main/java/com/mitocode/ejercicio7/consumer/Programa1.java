package com.mitocode.ejercicio7.consumer;

import java.util.function.Consumer;

public class Programa1 {
	public static void main(String[] args) {
//		IConsumer ic = new IConsumer() {
//			
//			@Override
//			public void accept(String s) {
//				System.out.println("Imprime: " + s);
//			}
//		};
//		
		IConsumer<String> ic = (s) -> System.out.println(s); 		
		ic.accept("Jean");
		
		IConsumer<Integer> ic1 = (s) -> System.out.println(s); 
		ic1.accept(10);
		
		//interfaz consumer, solor acepta un parametro
		Consumer<String> c1 = (c) -> System.out.println(c);
		c1.accept("jean 1");
		
		Consumer<Integer> c2 = (x) -> System.out.println(x);
		c2.accept(15);
	}
}
