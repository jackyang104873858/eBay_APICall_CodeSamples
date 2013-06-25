//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultValuesCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchResultValuesCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="CharityListing"/>
 *     &lt;enumeration value="Picture"/>
 *     &lt;enumeration value="Gift"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchResultValuesCodeType")
@XmlEnum
public enum SearchResultValuesCodeType {


    /**
     * 
     * 					
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),

    /**
     * 
     * 						(out) Indicates items listed one day or less earlier than the current query.
     * 						If the listing is no more than one day old, New returns a value of true.
     * 					
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * 
     * 						(out) Indicates that the seller has chosen to use eBay Giving Works to donate
     * 						a percentage of the item purchase price to a selected nonprofit organization.
     * 						Not applicable for eBay Motors, international sites, and Real Estate and Tickets listings.
     * 					
     * 
     */
    @XmlEnumValue("CharityListing")
    CHARITY_LISTING("CharityListing"),

    /**
     * 
     * 					
     * 
     */
    @XmlEnumValue("Picture")
    PICTURE("Picture"),

    /**
     * 
     * 					
     * 
     */
    @XmlEnumValue("Gift")
    GIFT("Gift"),

    /**
     * 
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SearchResultValuesCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResultValuesCodeType fromValue(String v) {
        for (SearchResultValuesCodeType c: SearchResultValuesCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}