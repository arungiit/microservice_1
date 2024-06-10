package com.giit.Microservices_1.service.impl;

import com.giit.Microservices_1.entity.Customer;
import com.giit.Microservices_1.repository.CustomerRepository;
import com.giit.Microservices_1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceimpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        customerRepository.save(customer);

        return customer;
    }
}
