package com.klef.jfsd.springboot.service;

import org.springframework.stereotype.Repository;
import com.klef.jfsd.springboot.model.Customer;

@Repository
public interface CustomerService 
{
   public Customer addcustomer(Customer customer);
   public Customer checkcustomerlogin(String uname,String pwd);
 
}
