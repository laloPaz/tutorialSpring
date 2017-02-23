package com.tutorial.spring.hello;

public class HelloWorld {
	
	private String mensajeUno;

	public String getMensajeUno() {
		return mensajeUno;
	}

	public void setMensajeUno(String mensajeUno) {
		this.mensajeUno = mensajeUno;
	}
	
	public void init(){
		System.out.println("Estoy inicializando el Bean HelloWorld");
	}
	
	public void destroy(){
		System.out.println("Estoy destruyendo el Bean HelloWorld");
	}
}