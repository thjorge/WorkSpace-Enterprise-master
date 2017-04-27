package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Anota��o estar� presente at� a execu��o
@Retention(RetentionPolicy.RUNTIME)
//Anota��o somente para os atributos e m�todos
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Coluna {

	String nome();
	
}