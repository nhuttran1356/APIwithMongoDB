package com.mongodbapo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String postCode;
    private String city;
}
