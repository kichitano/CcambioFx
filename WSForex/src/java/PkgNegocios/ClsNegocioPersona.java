/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgConexion.ClsConexion;
import PkgEntidad.ClsEntidadPersona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Corei7
 */
public class ClsNegocioPersona {
    
    ClsEntidadPersona entidadUsuario;
    ClsConexion conexion;
    
    public ClsEntidadPersona IniciarSesion(String usuario,String password ) throws SQLException, ClassNotFoundException{
        
        conexion = new ClsConexion();
        Connection connection = conexion.getConnection();
        entidadUsuario = new ClsEntidadPersona();
        
        try{
            PreparedStatement consulta;
            consulta = connection.prepareStatement("CALL sp_login (?,?)");
            consulta.setString(1, usuario);
            consulta.setString(2, password);
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next()){
                entidadUsuario.setIdTipoDocumento(resultado.getString("TipoDocumento_IdTipoDocumento"));
                entidadUsuario.setNumeroDocumentoPersona(resultado.getString("NumeroDocumentoPersona"));
                entidadUsuario.setApellidoPrimeroPersona(resultado.getString("ApellidoPrimeroPersona"));
                entidadUsuario.setApellidoSegundoPersona(resultado.getString("ApellidoSegundoPersona"));
                entidadUsuario.setNombresPersona(resultado.getString("NombresPersona"));
                entidadUsuario.setIdPais(resultado.getString("Pais_idPais"));
                entidadUsuario.setIdOcupacion(resultado.getString("Ocupacion_IdOcupacion"));
                return entidadUsuario;
            }
            connection.close();
        }catch(SQLException e){}               
    
        return entidadUsuario;
    }    
     public void guardarPersona(ClsEntidadPersona clsEntidadPersona) {
        conexion = new ClsConexion();
        Connection connection = conexion.getConnection();
        String cadenaSql = "CALL insertarPersona (?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(cadenaSql);
                preparedStatement.setString(1,clsEntidadPersona.getIdTipoDocumento());
                preparedStatement.setString(2,clsEntidadPersona.getNumeroDocumentoPersona());
                preparedStatement.setString(3,clsEntidadPersona.getApellidoPrimeroPersona());
                preparedStatement.setString(4,clsEntidadPersona.getApellidoSegundoPersona());
                preparedStatement.setString(5,clsEntidadPersona.getNombresPersona());
                preparedStatement.setString(6,clsEntidadPersona.getIdPais());
                preparedStatement.setString(7,clsEntidadPersona.getIdOcupacion());
                preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }catch (Exception e){
        }
    }
}
