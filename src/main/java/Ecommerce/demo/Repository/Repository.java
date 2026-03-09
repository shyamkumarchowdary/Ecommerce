package Ecommerce.demo.Repository;

import Ecommerce.demo.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Customer, Integer> {
}
