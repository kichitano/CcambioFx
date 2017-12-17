/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgWS.ClsEntidadTipoOficina;
import PkgWS.WSCambio;
import PkgWS.WSCambio_Service;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Corei7
 */
public class DescargarDatos extends Thread{
    
    WSCambio_Service wsCambioService = new WSCambio_Service();
    WSCambio wsCambio;
    
    public DescargarDatos() throws FileNotFoundException, IOException{
        
        wsCambio = wsCambioService.getWSCambioPort();
        ArrayList<ClsEntidadTipoOficina> datosTipoOficina;
        
        
        datosTipoOficina = (ArrayList<ClsEntidadTipoOficina>) wsCambio.cargarTipoOficina();
        
        
        File DirDatosTO = new File("\\Dir\\DatosTO");
        
           
       if(!DirDatosTO.exists()){ //SI EL DIRECTORIO NO EXISTE
           DirDatosTO.mkdir();
           JSONObject ObjDirDatosTOJson =  new JSONObject();
           JSONArray ArrayDirDatosTOJson = new JSONArray();
            for(int x=0;x<datosTipoOficina.size();x++) {
               ArrayDirDatosTOJson.put(datosTipoOficina.get(x));
            }
            ObjDirDatosTOJson.put("TipoOficinas", ArrayDirDatosTOJson);
            
            try {
                FileWriter file = new FileWriter("\\Dir\\DatosTO\\DatosTO.json");
                file.write(ObjDirDatosTOJson.toString());
                file.flush();
                file.close();
            }catch(IOException e){}
       }else{   //PERO SI EXISTE ENTONCES COMPROBAR LOS DATOS DE LOS ARCHIVOS
           
       }
        
        
    }
    
    @Override
    public void run(){}
    
}
