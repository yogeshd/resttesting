//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.04 at 05:21:14 PM IST 
//


package com.rest.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rest.input.Person;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loveme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="person1" type="{http://www.example.org/person}Person"/>
 *         &lt;element name="person2" type="{http://www.example.org/person}Person"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "loveme",
    "person1",
    "person2"
})
public class Result {

    @XmlElement(required = true)
    protected String loveme;
    @XmlElement(required = true)
    protected Person person1;
    @XmlElement(required = true)
    protected Person person2;

    /**
     * Gets the value of the loveme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoveme() {
        return loveme;
    }

    /**
     * Sets the value of the loveme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoveme(String value) {
        this.loveme = value;
    }

    /**
     * Gets the value of the person1 property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson1() {
        return person1;
    }

    /**
     * Sets the value of the person1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson1(Person value) {
        this.person1 = value;
    }

    /**
     * Gets the value of the person2 property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson2() {
        return person2;
    }

    /**
     * Sets the value of the person2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson2(Person value) {
        this.person2 = value;
    }

}
