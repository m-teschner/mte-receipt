//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.04.28 um 09:58:20 PM CEST 
//


package de.mte.receipt.cookml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inote" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="qty" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="item" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bls" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="gram" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *       &lt;attribute name="shop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="calc" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ridlink" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inote"
})
@XmlRootElement(name = "ingredient")
public class Ingredient {

    protected List<String> inote;
    @XmlAttribute(name = "qty")
    protected Float qty;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "item", required = true)
    protected String item;
    @XmlAttribute(name = "bls")
    protected String bls;
    @XmlAttribute(name = "gram")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger gram;
    @XmlAttribute(name = "shop")
    protected Boolean shop;
    @XmlAttribute(name = "calc")
    protected Boolean calc;
    @XmlAttribute(name = "ridlink")
    protected String ridlink;

    /**
     * Gets the value of the inote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInote() {
        if (inote == null) {
            inote = new ArrayList<String>();
        }
        return this.inote;
    }

    /**
     * Ruft den Wert der qty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQty() {
        return qty;
    }

    /**
     * Legt den Wert der qty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQty(Float value) {
        this.qty = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der item-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Legt den Wert der item-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Ruft den Wert der bls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBls() {
        return bls;
    }

    /**
     * Legt den Wert der bls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBls(String value) {
        this.bls = value;
    }

    /**
     * Ruft den Wert der gram-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGram() {
        return gram;
    }

    /**
     * Legt den Wert der gram-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGram(BigInteger value) {
        this.gram = value;
    }

    /**
     * Ruft den Wert der shop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShop() {
        if (shop == null) {
            return true;
        } else {
            return shop;
        }
    }

    /**
     * Legt den Wert der shop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShop(Boolean value) {
        this.shop = value;
    }

    /**
     * Ruft den Wert der calc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalc() {
        return calc;
    }

    /**
     * Legt den Wert der calc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalc(Boolean value) {
        this.calc = value;
    }

    /**
     * Ruft den Wert der ridlink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRidlink() {
        return ridlink;
    }

    /**
     * Legt den Wert der ridlink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRidlink(String value) {
        this.ridlink = value;
    }

}
