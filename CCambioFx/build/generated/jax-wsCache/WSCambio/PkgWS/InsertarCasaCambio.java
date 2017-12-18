
package PkgWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertarCasaCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertarCasaCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoOficina_IdTipoOficina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DireccionCasaCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distrito_IdDistrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CasaCambioTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CasaCambioCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertarCasaCambio", propOrder = {
    "tipoOficinaIdTipoOficina",
    "direccionCasaCambio",
    "distritoIdDistrito",
    "casaCambioTelefono",
    "casaCambioCelular",
    "estado"
})
public class InsertarCasaCambio {

    @XmlElement(name = "TipoOficina_IdTipoOficina")
    protected int tipoOficinaIdTipoOficina;
    @XmlElement(name = "DireccionCasaCambio")
    protected String direccionCasaCambio;
    @XmlElement(name = "Distrito_IdDistrito")
    protected int distritoIdDistrito;
    @XmlElement(name = "CasaCambioTelefono")
    protected String casaCambioTelefono;
    @XmlElement(name = "CasaCambioCelular")
    protected String casaCambioCelular;
    @XmlElement(name = "Estado")
    protected int estado;

    /**
     * Obtiene el valor de la propiedad tipoOficinaIdTipoOficina.
     * 
     */
    public int getTipoOficinaIdTipoOficina() {
        return tipoOficinaIdTipoOficina;
    }

    /**
     * Define el valor de la propiedad tipoOficinaIdTipoOficina.
     * 
     */
    public void setTipoOficinaIdTipoOficina(int value) {
        this.tipoOficinaIdTipoOficina = value;
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
     */
    public int getDistritoIdDistrito() {
        return distritoIdDistrito;
    }

    /**
     * Define el valor de la propiedad distritoIdDistrito.
     * 
     */
    public void setDistritoIdDistrito(int value) {
        this.distritoIdDistrito = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

}
