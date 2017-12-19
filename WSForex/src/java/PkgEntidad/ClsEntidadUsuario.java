/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgEntidad;

/**
 *
 * @author adminsa16
 */
public class ClsEntidadUsuario {

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getPersona_NumeroDocumentoPersona() {
        return Persona_NumeroDocumentoPersona;
    }

    public void setPersona_NumeroDocumentoPersona(String Persona_NumeroDocumentoPersona) {
        this.Persona_NumeroDocumentoPersona = Persona_NumeroDocumentoPersona;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getPasswordUsuario() {
        return PasswordUsuario;
    }

    public void setPasswordUsuario(String PasswordUsuario) {
        this.PasswordUsuario = PasswordUsuario;
    }

    public String getTipoUsuario_IdTipoUsuario() {
        return TipoUsuario_IdTipoUsuario;
    }

    public void setTipoUsuario_IdTipoUsuario(String TipoUsuario_IdTipoUsuario) {
        this.TipoUsuario_IdTipoUsuario = TipoUsuario_IdTipoUsuario;
    }

    public String getEstadoUsuario() {
        return EstadoUsuario;
    }

    public void setEstadoUsuario(String EstadoUsuario) {
        this.EstadoUsuario = EstadoUsuario;
    }
    String IdUsuario;
    String Persona_NumeroDocumentoPersona;
    String NombreUsuario;
    String PasswordUsuario;
    String TipoUsuario_IdTipoUsuario;
    String EstadoUsuario;
    
}
