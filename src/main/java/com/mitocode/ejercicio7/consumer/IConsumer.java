package com.mitocode.ejercicio7.consumer;

@FunctionalInterface
public interface IConsumer<T> {
	
	void accept(T t);
}
