
package PkgWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsEntidadListaUbicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsEntidadListaUbicacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDistrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreDistrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsEntidadListaUbicacion", propOrder = {
    "idDepartamento",
    "idDistrito",
    "idProvincia",
    "nombreDepartamento",
    "nombreDistrito",
    "nombreProvincia"
})
public class ClsEntidadListaUbicacion {

    protected String idDepartamento;
    protected String idDistrito;
    protected String idProvincia;
    protected String nombreDepartamento;
    protected String nombreDistrito;
    protected String nombreProvincia;

    /**
     * Obtiene el valor de la propiedad idDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDepartamento() {
        return idDepartamento;
    }

    /**
     * Define el valor de la propiedad idDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDepartamento(String value) {
        this.idDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad idDistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDistrito() {
        return idDistrito;
    }

    /**
     * Define el valor de la propiedad idDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDistrito(String value) {
        this.idDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProvincia(String value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    /**
     * Define el valor de la propiedad nombreDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDepartamento(String value) {
        this.nombreDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDistrito() {
        return nombreDistrito;
    }

    /**
     * Define el valor de la propiedad nombreDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDistrito(String value) {
        this.nombreDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    /**
     * Define el valor de la propiedad nombreProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProvincia(String value) {
        this.nombreProvincia = value;
    }

}
