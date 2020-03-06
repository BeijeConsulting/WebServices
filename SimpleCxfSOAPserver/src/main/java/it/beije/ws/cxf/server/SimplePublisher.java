package it.beije.ws.cxf.server;

import javax.xml.ws.Endpoint;

public class SimplePublisher {
	
	public static void main(String[] args) {
		System.out.println("Starting Server");
		Ciao service = new CiaoImpl();
		String address = "http://localhost:9000/ciao";
		Endpoint.publish(address, service);
	}
}
