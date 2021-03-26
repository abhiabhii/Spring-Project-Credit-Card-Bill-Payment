package com.cg.creditcardbillpayment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.creditcardbillpayment.exceptions.CustomerServiceException;
import com.cg.creditcardbillpayment.entities.Address;
import com.cg.creditcardbillpayment.entities.Customer;
import com.cg.creditcardbillpayment.services.CustomerService;
/************************************************************************************
 *          @author          S.Abhishek
 *          Description      It is a Test class that provides the testcases to test the CustomerService Class
                                          
  *         Version             1.0
  *         Created Date    22-March-2021
 ************************************************************************************/
@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService customerservice;
	Address address=new Address("101","ab","che","ind","ap",22);
	Customer customer=new Customer("vtu6","abhi","abhishek","8886","29-05-2000",address);
	Customer customer1=new Customer("vtu96","abhi","abhishek","8886","29-05-2000",address);
	@Test
	void AddTest() {
		assertEquals("abhi",customerservice.getCustomer("vtu96").getName());
	}
	@Test
	void AddTest1() {
		assertEquals("9398",customerservice.getCustomer("vtu6").getContactNo());
	}
	@Test
	void getTest() {
		assertEquals("8886",customerservice.getCustomer(customer1.getUserId()).getContactNo());
	}
	@Test
	void getTest1() {
		assertEquals("abhishek",customerservice.getCustomer("vtu96").getEmail());
	}

	@Test
	void updateTest() {
		assertEquals("abhishek",customerservice.getCustomer(customer1.getUserId()).getEmail());
	}
	
	@Test
	void updateTest1() {
		assertEquals("string",customerservice.getCustomer("vtu6").getDob());
	}
	@Test
	void deleteTest() {
		assertThrows(CustomerServiceException.class,()->{
			customerservice.removeCustomer("vt55");
		});
	}
}

