
package PkgWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsEntidadPersona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsEntidadPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoPrimeroPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoSegundoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOcupacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombresPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsEntidadPersona", propOrder = {
    "apellidoPrimeroPersona",
    "apellidoSegundoPersona",
    "idOcupacion",
    "idPais",
    "idTipoDocumento",
    "nombresPersona",
    "numeroDocumentoPersona"
})
public class ClsEntidadPersona {

    protected String apellidoPrimeroPersona;
    protected String apellidoSegundoPersona;
    protected String idOcupacion;
    protected String idPais;
    protected String idTipoDocumento;
    protected String nombresPersona;
    protected String numeroDocumentoPersona;

    /**
     * Obtiene el valor de la propiedad apellidoPrimeroPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPrimeroPersona() {
        return apellidoPrimeroPersona;
    }

    /**
     * Define el valor de la propiedad apellidoPrimeroPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPrimeroPersona(String value) {
        this.apellidoPrimeroPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoSegundoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoSegundoPersona() {
        return apellidoSegundoPersona;
    }

    /**
     * Define el valor de la propiedad apellidoSegundoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoSegundoPersona(String value) {
        this.apellidoSegundoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad idOcupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOcupacion() {
        return idOcupacion;
    }

    /**
     * Define el valor de la propiedad idOcupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOcupacion(String value) {
        this.idOcupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPais() {
        return idPais;
    }

    /**
     * Define el valor de la propiedad idPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPais(String value) {
        this.idPais = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define el valor de la propiedad idTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoDocumento(String value) {
        this.idTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombresPersona() {
        return nombresPersona;
    }

    /**
     * Define el valor de la propiedad nombresPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombresPersona(String value) {
        this.nombresPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumentoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumentoPersona() {
        return numeroDocumentoPersona;
    }

    /**
     * Define el valor de la propiedad numeroDocumentoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumentoPersona(String value) {
        this.numeroDocumentoPersona = value;
    }

}
