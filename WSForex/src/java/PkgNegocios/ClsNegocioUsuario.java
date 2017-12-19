/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgConexion.ClsConexion;
import PkgEntidad.ClsEntidadUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author adminsa16
 */
public class ClsNegocioUsuario {
    ClsConexion con;
    public void guardarUsuario(ClsEntidadUsuario clsEntidadUsuario) {
        con = new ClsConexion();
        Connection connection = con.getConnection();
        String cadenaSql = "CALL insertarUsuario (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(cadenaSql);
                preparedStatement.setString(1,clsEntidadUsuario.getPersona_NumeroDocumentoPersona());
                preparedStatement.setString(2,clsEntidadUsuario.getNombreUsuario());
                preparedStatement.setString(3,clsEntidadUsuario.getPasswordUsuario());
                preparedStatement.setString(4,clsEntidadUsuario.getTipoUsuario_IdTipoUsuario());
                preparedStatement.setString(5,clsEntidadUsuario.getEstadoUsuario());
                preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }catch (Exception e){
        }
    }
}
