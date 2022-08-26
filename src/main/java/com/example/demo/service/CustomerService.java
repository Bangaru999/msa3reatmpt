package com.example.demo.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Customer;
import com.example.demo.Exceptions.CustomerAlreadyExistsException;
import com.example.demo.Repository.CustomerRepository;

public interface CustomerService {
	Customer getCustomer(int id);
	String addCustomer(Customer customer);
	String updateCustomer(Customer customer);

}

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository  customerRepository;
	
	public Customer getcustomer(int id) {
		return customerRepository.findById(id).orElseThrow(()-> new NoSuchElementException("No Customer Present with id" + id));
		
	}
	
public String addCustomer(Customer customer) {
	Customer existingcustomer= customerRepository.findById(customer.getId()).orElse(null);
	if(existingcustomer== null) {
		return "Customer added Sucessfully";
	}else {
		throw new CustomerAlreadyExistsException("customer already exists!!");
	}
}
	

public String updateCustomer(Customer customer) {
	Customer existingcustomer= customerRepository.findById(customer.getId()).orElse(null);
	if(existingcustomer== null) 
	throw new NoSuchCustomerExistsException("No such customer exists");
	
	}

@Override
public Customer getCustomer(int id) {
	// TODO Auto-generated method stub
	return null;
}else 
		throw new CustomerAlreadyExistsException("Record updated sucessfully!!");
	}
}
	 
	


