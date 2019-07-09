package com.springboot.h2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    public Long getCustomerId() {
	return customerId;
    }

    public void setCustomerId(Long customerId) {
	this.customerId = customerId;
    }

    public String getCustomerName() {
	return customerName;
    }

    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    public String toString() {
	return String.format("Customer id: %d ,Customer name: %s", customerId, customerName);
    }

}
