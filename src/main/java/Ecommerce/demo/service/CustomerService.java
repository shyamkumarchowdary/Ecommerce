package Ecommerce.demo.service;

import Ecommerce.demo.Model.Customer;
import Ecommerce.demo.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    @Autowired
    private Repository repository;

    public Customer saveCustomerDetails(Customer c) {
        return repository.save(c);
    }
}
