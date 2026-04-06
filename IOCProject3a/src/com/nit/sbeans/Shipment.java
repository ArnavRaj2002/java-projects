package com.nit.sbeans;

public class Shipment 
{
private String shipmentId;
private String address;
private Order order;
public Shipment() {
	System.out.println("Shipment.Shipment()");
	
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}


public void setShipmentId(String shipmentId) {
	this.shipmentId = shipmentId;
}
@Override
public String toString() {
	return "Shipment [shipmentId=" + shipmentId + ", address=" + address + ", order=" + order + "]";
}


}
