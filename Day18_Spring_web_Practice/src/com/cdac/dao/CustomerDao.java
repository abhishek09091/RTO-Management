package com.cdac.dao;

import org.springframework.web.multipart.MultipartFile;

import com.cdac.pojos.Customer;
import com.cdac.pojos.Image;

public interface CustomerDao {
Customer getCustomer(String uname,String pass);
int saveCustomer(Customer c);
int imageStore(MultipartFile file,Image img);
Image imageRestore(int imgid);
}
