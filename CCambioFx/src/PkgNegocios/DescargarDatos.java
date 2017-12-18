/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgWS.ClsEntidadPersona;
import PkgWS.ClsEntidadTipoOficina;
import PkgWS.WSCambio;
import PkgWS.WSCambio_Service;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
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
        File DirDatosTO = new File("Dir/DatosTO");  //DIRECTORIO TIPO DE OFICINA
        if(!DirDatosTO.exists()){ //SI EL DIRECTORIO NO EXISTE
           DirDatosTO.mkdirs();
           JSONObject ObjDirDatosTOJson =  new JSONObject();
           JSONObject ArrayDirDatosTOJson = new JSONObject();
            for(int x=0;x<wsCambio.cargarTipoOficina().size();x++) {
                ArrayDirDatosTOJson.put("IdTipoOficina",wsCambio.cargarTipoOficina().get(x).getIdTIpoOficina()); 
                ArrayDirDatosTOJson.put("DescripcionTipoOficina",wsCambio.cargarTipoOficina().get(x).getDescripcionTipoOficina());
            }
            ObjDirDatosTOJson.put("TipoOficinas", ArrayDirDatosTOJson);
            String archivo = "Dir/DatosTO/DatosTO.json";
            try (FileWriter file = new FileWriter(archivo)){
                file.write(ObjDirDatosTOJson.toString());
                file.flush();
                File arch = new File(archivo);
                FileChannel channel = new RandomAccessFile(arch,"rw").getChannel();
                FileLock lock = channel.lock();
            }catch(IOException e){}
               
        }else{   //PERO SI EXISTE ENTONCES COMPROBAR LOS DATOS DE LOS ARCHIVOS
           
        }
    }
    
    @Override
    public void run(){}
    
}
