/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgWsCambio;

import PkgEntidad.ClsEntidadPersona;
import PkgNegocios.ClsNegocioPersona;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import PkgEntidad.ClsEntidadPersona;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Corei7
 */
@WebService(serviceName = "WSCambio")
public class WSCambio {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IniciarSesion")
    public ClsEntidadPersona IniciarSesion(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        ClsNegocioPersona negocioPersona = new ClsNegocioPersona();
        ClsEntidadPersona entidadPersona = new ClsEntidadPersona();
        
        try {
            entidadPersona = negocioPersona.IniciarSesion(usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(WSCambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WSCambio.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return entidadPersona;
    }
}
