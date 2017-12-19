
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

    private final static QName _InsertarUsuarioResponse_QNAME = new QName("http://PkgWsCambio/", "InsertarUsuarioResponse");
    private final static QName _InsertarCasaCambioResponse_QNAME = new QName("http://PkgWsCambio/", "InsertarCasaCambioResponse");
    private final static QName _InsertarCasaCambio_QNAME = new QName("http://PkgWsCambio/", "InsertarCasaCambio");
    private final static QName _CargarTipoOficina_QNAME = new QName("http://PkgWsCambio/", "CargarTipoOficina");
    private final static QName _CargarListaUbicacion_QNAME = new QName("http://PkgWsCambio/", "CargarListaUbicacion");
    private final static QName _IniciarSesion_QNAME = new QName("http://PkgWsCambio/", "IniciarSesion");
    private final static QName _InsertarUsuario_QNAME = new QName("http://PkgWsCambio/", "InsertarUsuario");
    private final static QName _CargarListaUbicacionResponse_QNAME = new QName("http://PkgWsCambio/", "CargarListaUbicacionResponse");
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
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link CargarListaUbicacionResponse }
     * 
     */
    public CargarListaUbicacionResponse createCargarListaUbicacionResponse() {
        return new CargarListaUbicacionResponse();
    }

    /**
     * Create an instance of {@link CargarTipoOficina }
     * 
     */
    public CargarTipoOficina createCargarTipoOficina() {
        return new CargarTipoOficina();
    }

    /**
     * Create an instance of {@link CargarListaUbicacion }
     * 
     */
    public CargarListaUbicacion createCargarListaUbicacion() {
        return new CargarListaUbicacion();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarCasaCambio }
     * 
     */
    public InsertarCasaCambio createInsertarCasaCambio() {
        return new InsertarCasaCambio();
    }

    /**
     * Create an instance of {@link InsertarCasaCambioResponse }
     * 
     */
    public InsertarCasaCambioResponse createInsertarCasaCambioResponse() {
        return new InsertarCasaCambioResponse();
    }

    /**
     * Create an instance of {@link ClsEntidadTipoOficina }
     * 
     */
    public ClsEntidadTipoOficina createClsEntidadTipoOficina() {
        return new ClsEntidadTipoOficina();
    }

    /**
     * Create an instance of {@link ClsEntidadUsuario }
     * 
     */
    public ClsEntidadUsuario createClsEntidadUsuario() {
        return new ClsEntidadUsuario();
    }

    /**
     * Create an instance of {@link ClsEntidadPersona }
     * 
     */
    public ClsEntidadPersona createClsEntidadPersona() {
        return new ClsEntidadPersona();
    }

    /**
     * Create an instance of {@link ClsEntidadCasaCambio }
     * 
     */
    public ClsEntidadCasaCambio createClsEntidadCasaCambio() {
        return new ClsEntidadCasaCambio();
    }

    /**
     * Create an instance of {@link ClsEntidadListaUbicacion }
     * 
     */
    public ClsEntidadListaUbicacion createClsEntidadListaUbicacion() {
        return new ClsEntidadListaUbicacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "InsertarUsuarioResponse")
    public JAXBElement<InsertarUsuarioResponse> createInsertarUsuarioResponse(InsertarUsuarioResponse value) {
        return new JAXBElement<InsertarUsuarioResponse>(_InsertarUsuarioResponse_QNAME, InsertarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCasaCambioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "InsertarCasaCambioResponse")
    public JAXBElement<InsertarCasaCambioResponse> createInsertarCasaCambioResponse(InsertarCasaCambioResponse value) {
        return new JAXBElement<InsertarCasaCambioResponse>(_InsertarCasaCambioResponse_QNAME, InsertarCasaCambioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCasaCambio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "InsertarCasaCambio")
    public JAXBElement<InsertarCasaCambio> createInsertarCasaCambio(InsertarCasaCambio value) {
        return new JAXBElement<InsertarCasaCambio>(_InsertarCasaCambio_QNAME, InsertarCasaCambio.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarListaUbicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "CargarListaUbicacion")
    public JAXBElement<CargarListaUbicacion> createCargarListaUbicacion(CargarListaUbicacion value) {
        return new JAXBElement<CargarListaUbicacion>(_CargarListaUbicacion_QNAME, CargarListaUbicacion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "InsertarUsuario")
    public JAXBElement<InsertarUsuario> createInsertarUsuario(InsertarUsuario value) {
        return new JAXBElement<InsertarUsuario>(_InsertarUsuario_QNAME, InsertarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarListaUbicacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PkgWsCambio/", name = "CargarListaUbicacionResponse")
    public JAXBElement<CargarListaUbicacionResponse> createCargarListaUbicacionResponse(CargarListaUbicacionResponse value) {
        return new JAXBElement<CargarListaUbicacionResponse>(_CargarListaUbicacionResponse_QNAME, CargarListaUbicacionResponse.class, null, value);
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
