package it.beije.ws.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.beije.ws.cxf.server.Ciao;

public class CiaoTestClient {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(Ciao.class);
		factory.setAddress("http://localhost:9000/ciao");
		
		Ciao client = (Ciao) factory.create();
		String reply = client.ciao("Testing it!");
		System.out.println("Server said: " + reply);
		System.exit(0);
	}

}
