package co.edureka.spring.core.lifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student {
	
	private String name;
	
	public 	Student() {
		System.out.println("@@ Zero-Argument Constructor");
	}
	public Student(String name) {
		this.name=name;
		System.out.println("@@ One-Argument Constructor");
	}
	public String getName() {
		
		System.out.println("Inside getName method");
		return name;
		
	}
	public void setName(String name) {
		System.out.println("Inside SetName method");
		this.name = name;
	}
	
@PostConstruct	
public void myInit() {
	System.out.println(" !!! Iam the Init() method ,i will work after the bean instantiation !!! ");
}
@PreDestroy
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println(" $$$ Iam the myDestroy() methos,I will destroy the method ");
}
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}

}
