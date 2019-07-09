package com.springboot.h2;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class H2DBTest {

    @Autowired
    private CustomerRepository repository;
    
    @Test
    public void getAllCustomerTest() {
	
	List<Customer> customers = repository.findAll();
	
	for(Customer c : customers) {
	    System.out.println(c);
	}
	
    }
}
