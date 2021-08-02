package co.td.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.td.spring.core.collections.beans.Invoice;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

Invoice invoice = (Invoice)context.getBean("invoice");
System.out.println("Invoice no:"  +  invoice.getInvoiceNumber());
System.out.println("CustomerName:" +invoice.getCustomerName());
System.out.println("items:" +invoice.getItems());
System.out.println("items type:" +invoice.getItems().getClass());

	}

}
