package com.example.web_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ShippingAddress {

    @GetMapping("/")
    public com.example.model.ShippingAddress getMethodName() {
        com.example.model.ShippingAddress address = new com.example.model.ShippingAddress();
        address.setAddressLine1("Address Line 1");
        address.setAddressLine2("Address Line 2");
        address.setCity("City");
        address.setState("State");
        address.setCountry("Country");
        address.setFullName("Full Name");
        address.setPhoneNumber("Phone Number");
        address.setPostalCode("Postal Code");

        return address;
    }

}
