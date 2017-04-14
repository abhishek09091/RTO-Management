package com.rto.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.rto.pojos.*;
import com.rto.services.RegisterService;
import com.rto.dao.Dao;
import com.rto.dao.DaoImpl;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private Dao dao;

	@Override
	public String saveDetails(UserInfo u) {
		System.out.println("in saveDetails");
		return dao.RegisterNewUser(u);
	}

	@Override
	public UserInfo vlaidateUser(User login) {
		System.out.println("In validateUser");
		return dao.validateUser(login);
	}
 
	
}
