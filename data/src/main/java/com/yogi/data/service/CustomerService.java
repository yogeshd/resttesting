package com.yogi.data.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogi.data.dao.CustomerMapper;
import com.yogi.data.model.Customer;
import com.yogi.data.model.CustomerExample;

@Service
public class CustomerService {

	 @Autowired
	  private CustomerMapper customerMapper;
	 
	 public List<Customer> getCustomers()
	 {
		 CustomerExample example=new CustomerExample();
		// example.createCriteria().
		 System.out.println("customerMapper"+customerMapper);
		return customerMapper.selectByExample(example);
		 
	 }
	
	
}
