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
    	
    	JavaCollection collections = (JavaCollection)context.getBean("javaCollection");
    	
    	collections.getAddressList();
    	collections.getAddressSet();
    	collections.getAddressMap();
    	collections.getAddressProp();
    	
    	
    	context.registerShutdownHook();
    	
    }
}
