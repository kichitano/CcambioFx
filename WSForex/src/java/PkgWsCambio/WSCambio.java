/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgWsCambio;

import PkgNegocios.ClsNegocioPersona;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import PkgEntidad.ClsEntidadPersona;
import PkgEntidad.ClsEntidadTipoOficina;
import PkgNegocios.ClsNegocioTipoOficina;
import java.util.ArrayList;

/**
 *
 * @author Corei7
 */
@WebService(serviceName = "WSCambio")
public class WSCambio {

    /**
     * Web service operation
     * @param usuario
     * @param password
     * @return 
     */
    @WebMethod(operationName = "IniciarSesion")
    public ClsEntidadPersona IniciarSesion(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        ClsNegocioPersona negocioPersona = new ClsNegocioPersona();
        ClsEntidadPersona entidadPersona = new ClsEntidadPersona();
        
        try {
            entidadPersona = negocioPersona.IniciarSesion(usuario, password);
        } catch (SQLException | ClassNotFoundException ex) {}
      
        return entidadPersona;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "CargarTipoOficina")
    public ArrayList<ClsEntidadTipoOficina> CargarTipoOficina() {
        ClsNegocioTipoOficina negocioTipoOficina = new ClsNegocioTipoOficina();
        
        ArrayList<ClsEntidadTipoOficina> DatosTipoOficina = negocioTipoOficina.ObtenerDatosTipoOficina();
        
        return DatosTipoOficina;
        
    }
}
