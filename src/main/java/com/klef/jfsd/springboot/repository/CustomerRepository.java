package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>
{
	@Query("select c from Customer c where username=?1 and password=?2")
	public Customer checkcustomerlogin(String uname,String pwd);
	
//	public Customer findByEmail(String email); 
//    public Customer findByResetPasswordToken(String token);
	
}
