
package PkgWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsEntidadCasaCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsEntidadCasaCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="casaCambioCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casaCambioTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionCasaCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distrito_IdDistrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCasaCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOficina_IdTipoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsEntidadCasaCambio", propOrder = {
    "casaCambioCelular",
    "casaCambioTelefono",
    "direccionCasaCambio",
    "distritoIdDistrito",
    "estado",
    "idCasaCambio",
    "tipoOficinaIdTipoOficina"
})
public class ClsEntidadCasaCambio {

    protected String casaCambioCelular;
    protected String casaCambioTelefono;
    protected String direccionCasaCambio;
    @XmlElement(name = "distrito_IdDistrito")
    protected String distritoIdDistrito;
    protected String estado;
    protected String idCasaCambio;
    @XmlElement(name = "tipoOficina_IdTipoOficina")
    protected String tipoOficinaIdTipoOficina;

    /**
     * Obtiene el valor de la propiedad casaCambioCelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasaCambioCelular() {
        return casaCambioCelular;
    }

    /**
     * Define el valor de la propiedad casaCambioCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasaCambioCelular(String value) {
        this.casaCambioCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad casaCambioTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasaCambioTelefono() {
        return casaCambioTelefono;
    }

    /**
     * Define el valor de la propiedad casaCambioTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasaCambioTelefono(String value) {
        this.casaCambioTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCasaCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCasaCambio() {
        return direccionCasaCambio;
    }

    /**
     * Define el valor de la propiedad direccionCasaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCasaCambio(String value) {
        this.direccionCasaCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoIdDistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistritoIdDistrito() {
        return distritoIdDistrito;
    }

    /**
     * Define el valor de la propiedad distritoIdDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistritoIdDistrito(String value) {
        this.distritoIdDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad idCasaCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCasaCambio() {
        return idCasaCambio;
    }

    /**
     * Define el valor de la propiedad idCasaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCasaCambio(String value) {
        this.idCasaCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOficinaIdTipoOficina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOficinaIdTipoOficina() {
        return tipoOficinaIdTipoOficina;
    }

    /**
     * Define el valor de la propiedad tipoOficinaIdTipoOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOficinaIdTipoOficina(String value) {
        this.tipoOficinaIdTipoOficina = value;
    }

}
