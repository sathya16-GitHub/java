package co.td.spring.core.collections.beans;

import java.util.Map;

public class Invoice {
private Long invoiceNumber;
private String customerName;
private Map<String,Integer> items;
public Long getInvoiceNumber() {
	return invoiceNumber;
}
public void setInvoiceNumber(Long invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Map<String, Integer> getItems() {
	return items;
}
public void setItems(Map<String, Integer> items) {
	this.items = items;
}

}
