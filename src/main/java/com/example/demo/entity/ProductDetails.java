package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDetails {

    private int productId;
    private String productName;
    private double productPrice;

}
