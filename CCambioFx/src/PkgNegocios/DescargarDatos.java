/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgWS.ClsEntidadListaUbicacion;
import PkgWS.ClsEntidadPersona;
import PkgWS.ClsEntidadTipoOficina;
import PkgWS.WSCambio;
import PkgWS.WSCambio_Service;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
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
        
        
        //KI_CHI
        File DirDatosTO = new File("Dir/DatosTO");  //DIRECTORIO TIPO DE OFICINA
        if(!DirDatosTO.exists()){ //SI EL DIRECTORIO NO EXISTE
           DirDatosTO.mkdirs();
           JSONObject ObjDirDatosTOJson =  new JSONObject();
           JSONObject ArrayDirDatosTOJson = new JSONObject();
           Gson gson = new Gson();
           ArrayList<ClsEntidadTipoOficina> DatosTipoOficina = new ArrayList<>();
           
            for(int x=0;x<wsCambio.cargarTipoOficina().size();x++) {
                
                ClsEntidadTipoOficina entidadTipoOficina = new ClsEntidadTipoOficina();
                ArrayDirDatosTOJson.put("IdTipoOficina",wsCambio.cargarTipoOficina().get(x).getIdTIpoOficina()); 
                ArrayDirDatosTOJson.put("DescripcionTipoOficina",wsCambio.cargarTipoOficina().get(x).getDescripcionTipoOficina());
                entidadTipoOficina.setIdTIpoOficina(wsCambio.cargarTipoOficina().get(x).getIdTIpoOficina());
                entidadTipoOficina.setDescripcionTipoOficina(wsCambio.cargarTipoOficina().get(x).getDescripcionTipoOficina());
                DatosTipoOficina.add(entidadTipoOficina);
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
        //KICHI
        
        // EDU
        File DirDatosLU = new File("Dir/DatosLU");  //DIRECTORIO TIPO DE OFICINA
        if(!DirDatosLU.exists()){ //SI EL DIRECTORIO NO EXISTE
           DirDatosLU.mkdirs();
           JSONObject ObjDirDatosTOJson =  new JSONObject();
           JSONObject ArrayDirDatosTOJson = new JSONObject();
           Gson gson = new Gson();
           ArrayList<ClsEntidadListaUbicacion> DatosListaUbicacion = new ArrayList<>();
           
            for(int x=0;x<wsCambio.cargarListaUbicacion().size();x++) {
                
                ClsEntidadListaUbicacion entidadListaUbicacion = new ClsEntidadListaUbicacion();
                ArrayDirDatosTOJson.put("IdDepartamento",wsCambio.cargarListaUbicacion().get(x).getIdDepartamento()); 
                ArrayDirDatosTOJson.put("NombreDepartamento",wsCambio.cargarListaUbicacion().get(x).getNombreDepartamento());
                
               // entidadListaUbicacion.setIdTIpoOficina(wsCambio.cargarListaUbicacion().get(x).getIdTIpoOficina());
               // entidadListaUbicacion.setDescripcionTipoOficina(wsCambio.cargarListaUbicacion().get(x).getDescripcionTipoOficina());
               //  DatosListaUbicacion.add(entidadListaUbicacion);
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
