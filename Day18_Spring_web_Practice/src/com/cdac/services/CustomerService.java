package com.cdac.services;

import org.springframework.web.multipart.MultipartFile;

import com.cdac.pojos.Customer;
import com.cdac.pojos.Image;

public interface CustomerService {
public Customer validateCustomer(String email,String pass);
public int registerCustomer(Customer c);
public int saveImage(MultipartFile file,Image img);
public Image getImage(int imgid);
}
