package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Partner;

public interface PartnerRepository extends CrudRepository<Partner, Integer>{
	
	@Query("select p from Partner p where username=?1 and password=?2")
	public Partner checkpartnerlogin(String uname,String pwd);

}
