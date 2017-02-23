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
    	context.registerShutdownHook();
    	System.out.println("Mensaje Uno: "+helloOne.getMensajeUno());
    }
}
