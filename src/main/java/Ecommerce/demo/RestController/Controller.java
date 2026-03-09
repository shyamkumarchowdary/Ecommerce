package Ecommerce.demo.RestController;

import Ecommerce.demo.Model.Customer;
import Ecommerce.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/register")
    public String getRegister(){
        return "Welcome to E commerce web site";
    }

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomerDetails(@RequestBody Customer c){
        return customerService.saveCustomerDetails(c);

    }
}

