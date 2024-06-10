package com.giit.Microservices_1.controller;

import com.giit.Microservices_1.entity.Customer;
import com.giit.Microservices_1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class CustomerRestController {

    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping("/create")
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        Customer customer1=iCustomerService.create(customer);
        return new ResponseEntity<>(customer1, HttpStatus.CREATED);
    }
}
