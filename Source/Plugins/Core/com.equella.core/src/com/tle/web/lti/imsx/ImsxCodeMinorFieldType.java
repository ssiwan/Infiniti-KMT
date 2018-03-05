/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.10 at 02:09:22 PM EST 
//


package com.tle.web.lti.imsx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The CodeMinorField complexType is the container a single code minor status code.
 *             
 * 
 * <p>Java class for imsx_CodeMinorField.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imsx_CodeMinorField.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_codeMinorFieldName"/>
 *         &lt;element ref="{http://www.imsglobal.org/services/ltiv1p1/xsd/imsoms_v1p0}imsx_codeMinorFieldValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imsx_CodeMinorField.Type", propOrder = {
    "imsxCodeMinorFieldName",
    "imsxCodeMinorFieldValue"
})
public class ImsxCodeMinorFieldType {

    @XmlElement(name = "imsx_codeMinorFieldName", required = true, defaultValue = "TargetEndSystem")
    protected String imsxCodeMinorFieldName;
    @XmlElement(name = "imsx_codeMinorFieldValue", required = true)
    protected ImsxCodeMinorValueType imsxCodeMinorFieldValue;

    /**
     * Gets the value of the imsxCodeMinorFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsxCodeMinorFieldName() {
        return imsxCodeMinorFieldName;
    }

    /**
     * Sets the value of the imsxCodeMinorFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsxCodeMinorFieldName(String value) {
        this.imsxCodeMinorFieldName = value;
    }

    /**
     * Gets the value of the imsxCodeMinorFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link ImsxCodeMinorValueType }
     *     
     */
    public ImsxCodeMinorValueType getImsxCodeMinorFieldValue() {
        return imsxCodeMinorFieldValue;
    }

    /**
     * Sets the value of the imsxCodeMinorFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsxCodeMinorValueType }
     *     
     */
    public void setImsxCodeMinorFieldValue(ImsxCodeMinorValueType value) {
        this.imsxCodeMinorFieldValue = value;
    }

}
