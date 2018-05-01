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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}cat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}hint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}sourceline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="content" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}picture" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}picbin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="card" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="servingqty" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="servingtype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="createuser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createemail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="changedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="changeuser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="changeemail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timeallqty" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *       &lt;attribute name="timeprepqty" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *       &lt;attribute name="timecookqty" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *       &lt;attribute name="costs" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="wwpoints" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cat",
    "hint",
    "sourceline",
    "content",
    "picture",
    "picbin"
})
@XmlRootElement(name = "head")
public class Head {

    protected List<String> cat;
    protected List<String> hint;
    protected List<String> sourceline;
    protected List<Head.Content> content;
    protected List<Picture> picture;
    protected List<Picbin> picbin;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "rid", required = true)
    protected String rid;
    @XmlAttribute(name = "card")
    protected String card;
    @XmlAttribute(name = "servingqty", required = true)
    protected float servingqty;
    @XmlAttribute(name = "servingtype", required = true)
    protected String servingtype;
    @XmlAttribute(name = "createdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdate;
    @XmlAttribute(name = "createuser")
    protected String createuser;
    @XmlAttribute(name = "createemail")
    protected String createemail;
    @XmlAttribute(name = "changedate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedate;
    @XmlAttribute(name = "changeuser")
    protected String changeuser;
    @XmlAttribute(name = "changeemail")
    protected String changeemail;
    @XmlAttribute(name = "timeallqty")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timeallqty;
    @XmlAttribute(name = "timeprepqty")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timeprepqty;
    @XmlAttribute(name = "timecookqty")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timecookqty;
    @XmlAttribute(name = "costs")
    protected String costs;
    @XmlAttribute(name = "wwpoints")
    protected Float wwpoints;

    /**
     * Gets the value of the cat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCat() {
        if (cat == null) {
            cat = new ArrayList<String>();
        }
        return this.cat;
    }

    /**
     * Gets the value of the hint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHint() {
        if (hint == null) {
            hint = new ArrayList<String>();
        }
        return this.hint;
    }

    /**
     * Gets the value of the sourceline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSourceline() {
        if (sourceline == null) {
            sourceline = new ArrayList<String>();
        }
        return this.sourceline;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Head.Content }
     * 
     * 
     */
    public List<Head.Content> getContent() {
        if (content == null) {
            content = new ArrayList<Head.Content>();
        }
        return this.content;
    }

    /**
     * Gets the value of the picture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Picture }
     * 
     * 
     */
    public List<Picture> getPicture() {
        if (picture == null) {
            picture = new ArrayList<Picture>();
        }
        return this.picture;
    }

    /**
     * Gets the value of the picbin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picbin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicbin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Picbin }
     * 
     * 
     */
    public List<Picbin> getPicbin() {
        if (picbin == null) {
            picbin = new ArrayList<Picbin>();
        }
        return this.picbin;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der rid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Legt den Wert der rid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Ruft den Wert der card-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Legt den Wert der card-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

    /**
     * Ruft den Wert der servingqty-Eigenschaft ab.
     * 
     */
    public float getServingqty() {
        return servingqty;
    }

    /**
     * Legt den Wert der servingqty-Eigenschaft fest.
     * 
     */
    public void setServingqty(float value) {
        this.servingqty = value;
    }

    /**
     * Ruft den Wert der servingtype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServingtype() {
        return servingtype;
    }

    /**
     * Legt den Wert der servingtype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServingtype(String value) {
        this.servingtype = value;
    }

    /**
     * Ruft den Wert der createdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedate() {
        return createdate;
    }

    /**
     * Legt den Wert der createdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedate(XMLGregorianCalendar value) {
        this.createdate = value;
    }

    /**
     * Ruft den Wert der createuser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * Legt den Wert der createuser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuser(String value) {
        this.createuser = value;
    }

    /**
     * Ruft den Wert der createemail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateemail() {
        return createemail;
    }

    /**
     * Legt den Wert der createemail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateemail(String value) {
        this.createemail = value;
    }

    /**
     * Ruft den Wert der changedate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedate() {
        return changedate;
    }

    /**
     * Legt den Wert der changedate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedate(XMLGregorianCalendar value) {
        this.changedate = value;
    }

    /**
     * Ruft den Wert der changeuser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeuser() {
        return changeuser;
    }

    /**
     * Legt den Wert der changeuser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeuser(String value) {
        this.changeuser = value;
    }

    /**
     * Ruft den Wert der changeemail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeemail() {
        return changeemail;
    }

    /**
     * Legt den Wert der changeemail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeemail(String value) {
        this.changeemail = value;
    }

    /**
     * Ruft den Wert der timeallqty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeallqty() {
        return timeallqty;
    }

    /**
     * Legt den Wert der timeallqty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeallqty(BigInteger value) {
        this.timeallqty = value;
    }

    /**
     * Ruft den Wert der timeprepqty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeprepqty() {
        return timeprepqty;
    }

    /**
     * Legt den Wert der timeprepqty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeprepqty(BigInteger value) {
        this.timeprepqty = value;
    }

    /**
     * Ruft den Wert der timecookqty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimecookqty() {
        return timecookqty;
    }

    /**
     * Legt den Wert der timecookqty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimecookqty(BigInteger value) {
        this.timecookqty = value;
    }

    /**
     * Ruft den Wert der costs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCosts() {
        return costs;
    }

    /**
     * Legt den Wert der costs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCosts(String value) {
        this.costs = value;
    }

    /**
     * Ruft den Wert der wwpoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWwpoints() {
        return wwpoints;
    }

    /**
     * Legt den Wert der wwpoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWwpoints(Float value) {
        this.wwpoints = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Content {

        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
