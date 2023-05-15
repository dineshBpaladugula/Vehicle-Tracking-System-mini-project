package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addcustomer(Customer customer) 
	{
		return customerRepository.save(customer);
		
	}

	@Override
	public Customer checkcustomerlogin(String uname, String pwd) 
	{
		return customerRepository.checkcustomerlogin(uname, pwd); 
	}


//    public void updateResetPasswordToken(String token, String email) throws CustomerNotFoundException {
//        Customer customer = customerRepository.findByEmail(email);
//        if (customer != null) {
//            customer.setResetPasswordToken(token);
//            customerRepository.save(customer);
//        } else {
//            throw new CustomerNotFoundException("Could not find any customer with the email " + email);
//        }
//    }
//     
//    public Customer getByResetPasswordToken(String token) {
//        return customerRepository.findByResetPasswordToken(token);
//    }
//     
//    public void updatePassword(Customer customer, String newPassword) {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(newPassword);
//        customer.setPassword(encodedPassword);
//         
//        customer.setResetPasswordToken(null);
//        customerRepository.save(customer);
//    }
}
