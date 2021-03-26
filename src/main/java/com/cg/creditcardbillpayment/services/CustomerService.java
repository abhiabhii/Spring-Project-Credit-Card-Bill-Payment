package com.cg.creditcardbillpayment.services;

import java.util.List;

import com.cg.creditcardbillpayment.exceptions.CustomerServiceException;
import com.cg.creditcardbillpayment.entities.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);

	public void removeCustomer(String custId) throws CustomerServiceException;

	public Customer updateCustomer(String custId, Customer customer);

	public Customer getCustomer(String string) throws CustomerServiceException;

	public List<Customer> getAllCustomers();
}
