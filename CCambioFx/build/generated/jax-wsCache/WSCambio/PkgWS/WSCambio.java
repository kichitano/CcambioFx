
package PkgWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSCambio", targetNamespace = "http://PkgWsCambio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCambio {


    /**
     * 
     * @param password
     * @param usuario
     * @return
     *     returns PkgWS.ClsEntidadPersona
     */
    @WebMethod(operationName = "IniciarSesion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "IniciarSesion", targetNamespace = "http://PkgWsCambio/", className = "PkgWS.IniciarSesion")
    @ResponseWrapper(localName = "IniciarSesionResponse", targetNamespace = "http://PkgWsCambio/", className = "PkgWS.IniciarSesionResponse")
    @Action(input = "http://PkgWsCambio/WSCambio/IniciarSesionRequest", output = "http://PkgWsCambio/WSCambio/IniciarSesionResponse")
    public ClsEntidadPersona iniciarSesion(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
