//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.09 at 12:33:57 PM EST 
//


package org.codesecure.dependencycheck.analyzer.pom.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Section for management of reports and their configuration.
 * 
 * <p>Java class for Reporting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reporting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="excludeDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plugins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reporting", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class Reporting {

    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected Boolean excludeDefaults;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String outputDirectory;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected Reporting.Plugins plugins;

    /**
     * Gets the value of the excludeDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public Boolean isExcludeDefaults() {
        return excludeDefaults;
    }

    /**
     * Sets the value of the excludeDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setExcludeDefaults(Boolean value) {
        this.excludeDefaults = value;
    }

    /**
     * Gets the value of the outputDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Sets the value of the outputDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setOutputDirectory(String value) {
        this.outputDirectory = value;
    }

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting.Plugins }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public Reporting.Plugins getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting.Plugins }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setPlugins(Reporting.Plugins value) {
        this.plugins = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "plugin"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public static class Plugins {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
        protected List<ReportPlugin> plugin;

        /**
         * Gets the value of the plugin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plugin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlugin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPlugin }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
        public List<ReportPlugin> getPlugin() {
            if (plugin == null) {
                plugin = new ArrayList<ReportPlugin>();
            }
            return this.plugin;
        }

    }

}
