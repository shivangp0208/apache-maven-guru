
package com.example.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * ShippingAddress
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullName",
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "country",
    "postalCode",
    "phoneNumber"
})
public class ShippingAddress {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    private String fullName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("addressLine2")
    private String addressLine2;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    private String state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullName", fullName).append("addressLine1", addressLine1).append("addressLine2", addressLine2).append("city", city).append("state", state).append("country", country).append("postalCode", postalCode).append("phoneNumber", phoneNumber).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(phoneNumber).append(city).append(postalCode).append(fullName).append(addressLine1).append(addressLine2).append(state).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingAddress) == false) {
            return false;
        }
        ShippingAddress rhs = ((ShippingAddress) other);
        return new EqualsBuilder().append(country, rhs.country).append(phoneNumber, rhs.phoneNumber).append(city, rhs.city).append(postalCode, rhs.postalCode).append(fullName, rhs.fullName).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2).append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
