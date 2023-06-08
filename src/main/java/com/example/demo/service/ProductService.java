package com.example.demo.service;

import com.example.demo.entity.ProductDetails;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductService {

    Logger logger = LoggerFactory.getLogger(ProductService.class);
    public ProductDetails getDetails(String productName){
        logger.info("Start of ProductService.getDetails method with input   "+productName);
        ProductDetails details = new ProductDetails();
        details.setProductId(5151);
        details.setProductName("Reebok");
        details.setProductPrice(9899);
        logger.debug("all the value of product object is initialized");
        logger.info("end of ProductService.getDetails method with input   "+productName);
        return details;
    }

}
