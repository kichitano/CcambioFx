
package PkgWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Persona_NumeroDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasswordUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoUsuario_IdTipoUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EstadoUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertarUsuario", propOrder = {
    "personaNumeroDocumentoPersona",
    "nombreUsuario",
    "passwordUsuario",
    "tipoUsuarioIdTipoUsuario",
    "estadoUsuario"
})
public class InsertarUsuario {

    @XmlElement(name = "Persona_NumeroDocumentoPersona")
    protected String personaNumeroDocumentoPersona;
    @XmlElement(name = "NombreUsuario")
    protected String nombreUsuario;
    @XmlElement(name = "PasswordUsuario")
    protected String passwordUsuario;
    @XmlElement(name = "TipoUsuario_IdTipoUsuario")
    protected int tipoUsuarioIdTipoUsuario;
    @XmlElement(name = "EstadoUsuario")
    protected int estadoUsuario;

    /**
     * Obtiene el valor de la propiedad personaNumeroDocumentoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaNumeroDocumentoPersona() {
        return personaNumeroDocumentoPersona;
    }

    /**
     * Define el valor de la propiedad personaNumeroDocumentoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaNumeroDocumentoPersona(String value) {
        this.personaNumeroDocumentoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    /**
     * Define el valor de la propiedad passwordUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordUsuario(String value) {
        this.passwordUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsuarioIdTipoUsuario.
     * 
     */
    public int getTipoUsuarioIdTipoUsuario() {
        return tipoUsuarioIdTipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuarioIdTipoUsuario.
     * 
     */
    public void setTipoUsuarioIdTipoUsuario(int value) {
        this.tipoUsuarioIdTipoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoUsuario.
     * 
     */
    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    /**
     * Define el valor de la propiedad estadoUsuario.
     * 
     */
    public void setEstadoUsuario(int value) {
        this.estadoUsuario = value;
    }

}
