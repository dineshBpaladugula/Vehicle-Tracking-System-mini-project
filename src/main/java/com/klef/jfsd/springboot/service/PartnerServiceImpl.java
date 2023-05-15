package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Partner;
import com.klef.jfsd.springboot.repository.PartnerRepository;
@Service
public class PartnerServiceImpl implements PartnerService{
	
	@Autowired
	private PartnerRepository partnerRepository;

	@Override

	public Partner checkpartnerlogin(String uname, String pwd) {
		// TODO Auto-generated method stub
		return partnerRepository.checkpartnerlogin(uname, pwd);
	}

	@Override
	public Partner addpartner(Partner partner) {
	// TODO Auto-generated method stub
		return partnerRepository.save(partner);
	}
	

}
