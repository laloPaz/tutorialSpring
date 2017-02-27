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
    	
    	TextEditor textEditor = (TextEditor)context.getBean("textEditor");
    	textEditor.spellCheck();
    	
    	context.registerShutdownHook();
    	
    }
}
