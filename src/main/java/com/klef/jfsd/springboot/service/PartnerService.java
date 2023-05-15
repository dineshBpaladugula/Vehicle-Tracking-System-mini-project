package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Partner;

@Repository
public interface PartnerService {
	
	public Partner checkpartnerlogin(String uname,String pwd);
	public Partner addpartner(Partner partner);
	
//    public List<Partner>  viewallpartners();
//    public void deletepartner(int id);
}
