
package it.beije.ws.jaxws.contacts.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.beije.ws.jaxws.contacts.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNamesResponse_QNAME = new QName("http://server.contacts.jaxws.ws.beije.it/", "getNamesResponse");
    private final static QName _GetContacts_QNAME = new QName("http://server.contacts.jaxws.ws.beije.it/", "getContacts");
    private final static QName _GetContactsResponse_QNAME = new QName("http://server.contacts.jaxws.ws.beije.it/", "getContactsResponse");
    private final static QName _GetNames_QNAME = new QName("http://server.contacts.jaxws.ws.beije.it/", "getNames");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.beije.ws.jaxws.contacts.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNamesResponse }
     * 
     */
    public GetNamesResponse createGetNamesResponse() {
        return new GetNamesResponse();
    }

    /**
     * Create an instance of {@link GetNames }
     * 
     */
    public GetNames createGetNames() {
        return new GetNames();
    }

    /**
     * Create an instance of {@link GetContactsResponse }
     * 
     */
    public GetContactsResponse createGetContactsResponse() {
        return new GetContactsResponse();
    }

    /**
     * Create an instance of {@link GetContacts }
     * 
     */
    public GetContacts createGetContacts() {
        return new GetContacts();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.contacts.jaxws.ws.beije.it/", name = "getNamesResponse")
    public JAXBElement<GetNamesResponse> createGetNamesResponse(GetNamesResponse value) {
        return new JAXBElement<GetNamesResponse>(_GetNamesResponse_QNAME, GetNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.contacts.jaxws.ws.beije.it/", name = "getContacts")
    public JAXBElement<GetContacts> createGetContacts(GetContacts value) {
        return new JAXBElement<GetContacts>(_GetContacts_QNAME, GetContacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.contacts.jaxws.ws.beije.it/", name = "getContactsResponse")
    public JAXBElement<GetContactsResponse> createGetContactsResponse(GetContactsResponse value) {
        return new JAXBElement<GetContactsResponse>(_GetContactsResponse_QNAME, GetContactsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.contacts.jaxws.ws.beije.it/", name = "getNames")
    public JAXBElement<GetNames> createGetNames(GetNames value) {
        return new JAXBElement<GetNames>(_GetNames_QNAME, GetNames.class, null, value);
    }

}
