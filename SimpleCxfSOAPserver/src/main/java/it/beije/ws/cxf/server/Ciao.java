package it.beije.ws.cxf.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Ciao {
    String ciao(@WebParam(name="name") String name);
}