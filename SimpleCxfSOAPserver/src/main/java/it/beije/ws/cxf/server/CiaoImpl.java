package it.beije.ws.cxf.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(
		endpointInterface = "it.beije.ws.cxf.server.Ciao",
		serviceName = "Ciao"
	)
public class CiaoImpl implements Ciao {
	
	@Override
	public String ciao(@WebParam(name = "name") String name) {
		System.out.println("say CIAO to " + name);
		return "CIAO " + name;
	}
	
}