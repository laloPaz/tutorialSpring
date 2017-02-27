package com.tutorial.spring.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
    	
    	HelloWorld helloOne = (HelloWorld)context.getBean("helloWorld");
    	helloOne.setMensajeUno("Hello World Pablo Paz Tellez");
    	System.out.println("Mensaje Uno: "+helloOne.getMensajeUno());
    	HelloWorld helloDos = (HelloWorld)context.getBean("helloWorld");
    	System.out.println("Mensaje Dos: "+helloDos.getMensajeUno());
    	
    	context.registerShutdownHook();
    	
    }
}
