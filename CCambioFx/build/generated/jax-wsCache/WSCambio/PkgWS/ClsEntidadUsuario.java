
package PkgWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsEntidadUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsEntidadUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persona_NumeroDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoUsuario_IdTipoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsEntidadUsuario", propOrder = {
    "estadoUsuario",
    "idUsuario",
    "nombreUsuario",
    "passwordUsuario",
    "personaNumeroDocumentoPersona",
    "tipoUsuarioIdTipoUsuario"
})
public class ClsEntidadUsuario {

    protected String estadoUsuario;
    protected String idUsuario;
    protected String nombreUsuario;
    protected String passwordUsuario;
    @XmlElement(name = "persona_NumeroDocumentoPersona")
    protected String personaNumeroDocumentoPersona;
    @XmlElement(name = "tipoUsuario_IdTipoUsuario")
    protected String tipoUsuarioIdTipoUsuario;

    /**
     * Obtiene el valor de la propiedad estadoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    /**
     * Define el valor de la propiedad estadoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoUsuario(String value) {
        this.estadoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
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
     * Obtiene el valor de la propiedad tipoUsuarioIdTipoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUsuarioIdTipoUsuario() {
        return tipoUsuarioIdTipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuarioIdTipoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUsuarioIdTipoUsuario(String value) {
        this.tipoUsuarioIdTipoUsuario = value;
    }

}
