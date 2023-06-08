package com.example.demo.Controller;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class ProductController {
        @Autowired
        private ProductService service;

        @GetMapping("getProductDetails")
        public String getProductDetails(@RequestParam("name") String name){
            log.info("Start of ProductController Class getProductDetails method");
            return service.getDetails(name).toString();
        }
    }

