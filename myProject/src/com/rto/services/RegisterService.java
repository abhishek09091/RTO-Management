package com.rto.services;

import org.springframework.web.multipart.MultipartFile;

import com.rto.pojos.*;


public interface RegisterService {

	String saveDetails(UserInfo u);

	UserInfo vlaidateUser(User login);

}
