package com.cdac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.dao.CustomerDao;
import com.cdac.pojos.Customer;
import com.cdac.pojos.Image;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
 
	@Autowired
	CustomerDao dao;
	
	@Override
	public Customer validateCustomer(String email,String pass) {
	
		return dao.getCustomer(email, pass);
	}

	@Override
	public int registerCustomer(Customer c) {
		
		return dao.saveCustomer(c);
	}

	@Override
	public int saveImage(MultipartFile file,Image img) {
		System.out.println("in save image of services");
		return dao.imageStore(file,img);
	}
	
	@Override
	public Image getImage(int imgid) {
		
		return dao.imageRestore(imgid);
	}
	
	
}
