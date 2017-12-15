/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgWS.ClsEntidadPersona;
import PkgWS.WSCambio;
import PkgWS.WSCambio_Service;

/**
 *
 * @author Corei7
 */
public class IniciarSesion implements Runnable{

    WSCambio_Service wsCambioService = new WSCambio_Service();
    WSCambio wsCambio;
    ClsEntidadPersona persona;
    static String Usuario,Password;
    
    public IniciarSesion(String usuario,String password){
        Usuario = usuario;
        Password = password;
    }
    
    @Override
    public void run() {
        try{
            wsCambio = wsCambioService.getWSCambioPort();
        }catch(Exception e){}
        persona = wsCambio.iniciarSesion(Usuario, Password);
        if(persona.getNumeroDocumentoPersona()!=(null)){
            System.out.println(persona.getNumeroDocumentoPersona());
        }else{
            System.out.println("Error de inicio de sesion");
        }
    }
    
}
