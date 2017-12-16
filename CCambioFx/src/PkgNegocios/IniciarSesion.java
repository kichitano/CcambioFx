/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgWS.ClsEntidadPersona;
import PkgWS.WSCambio;
import PkgWS.WSCambio_Service;
import java.util.concurrent.Callable;
import javafx.stage.Window;

/**
 *
 * @author Corei7
 */
public class IniciarSesion implements Callable<Boolean>{

    WSCambio_Service wsCambioService = new WSCambio_Service();
    WSCambio wsCambio;
    ClsEntidadPersona persona;
    Window Stage;
    static String Usuario,Password;
    boolean Sesion;
    
    public IniciarSesion(String usuario,String password){
        Usuario = usuario;
        Password = password;
        Sesion = false;

    }
    
    @Override
    public Boolean call() {
        try{
            wsCambio = wsCambioService.getWSCambioPort();
        }catch(Exception e){}
        persona = wsCambio.iniciarSesion(Usuario, Password);
        if(persona.getNumeroDocumentoPersona()!=(null)){
            Sesion = true;
        }else{
            Sesion = false;
            System.out.println("Error de inicio de sesion");
        }
        return Sesion;
    }
    
}
