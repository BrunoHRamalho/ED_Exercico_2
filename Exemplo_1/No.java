package br.com.exemplos.lista1;

public class No {
	public Object elemento;
	public No prox;
	
	public No (Object elem){  /*Construtor = mesmo nome da clase (No) */
		elemento = elem;
		prox = null; /*Proximo sempre aponta para "null" */
	}
}