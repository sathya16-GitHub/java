package co.edureka.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-------------------------------------------");
		context.registerShutdownHook();
	}
}
