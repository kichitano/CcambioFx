
package PkgWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the PkgWS package. 
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

    private final static QName _CargarTipoOficina_QNAME = new QName("http://PkgWsCambio/", "CargarTipoOficina");
    private final static QName _IniciarSesion_QNAME = new QName("http://PkgWsCambio/", "IniciarSesion");
    private final static QName _CargarTipoOficinaResponse_QNAME = new QName("http://PkgWsCambio/", "CargarTipoOficinaResponse");
    private final static QName _IniciarSesionResponse_QNAME = new QName("http://PkgWsCambio/", "IniciarSesionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: PkgWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CargarTipoOficinaResponse }
     * 
     */
    public CargarTipoOficinaResponse createCargarTipoOficinaResponse() {
        return new CargarTipoOficinaResponse();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link CargarTipoOficina }
     * 
     */
    public CargarTipoOficina createCargarTipoOficina() {
        return new CargarTipoOficina();
    }

    /**
     * Create an instance of {@link ClsEntidadTipoOficina }
     * 
     */
    public ClsEntidadTipoOficina createClsEntidadTipoOficina() {
        return new ClsEntidadTipoOficina();
    }

    /**
     * Create an instance of {@link ClsEntidadPersona }
     * 
     */
    public ClsEntidadPersona createClsEntidadPersona() {
        return new ClsEntidadPersona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarTipoOficina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "CargarTipoOficina")
    public JAXBElement<CargarTipoOficina> createCargarTipoOficina(CargarTipoOficina value) {
        return new JAXBElement<CargarTipoOficina>(_CargarTipoOficina_QNAME, CargarTipoOficina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "IniciarSesion")
    public JAXBElement<IniciarSesion> createIniciarSesion(IniciarSesion value) {
        return new JAXBElement<IniciarSesion>(_IniciarSesion_QNAME, IniciarSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarTipoOficinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "CargarTipoOficinaResponse")
    public JAXBElement<CargarTipoOficinaResponse> createCargarTipoOficinaResponse(CargarTipoOficinaResponse value) {
        return new JAXBElement<CargarTipoOficinaResponse>(_CargarTipoOficinaResponse_QNAME, CargarTipoOficinaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "IniciarSesionResponse")
    public JAXBElement<IniciarSesionResponse> createIniciarSesionResponse(IniciarSesionResponse value) {
        return new JAXBElement<IniciarSesionResponse>(_IniciarSesionResponse_QNAME, IniciarSesionResponse.class, null, value);
    }

}
