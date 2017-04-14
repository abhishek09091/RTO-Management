package com.cdac.dao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.pojos.Customer;
import com.cdac.pojos.Image;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sf;
	@Override
	public Customer getCustomer(String uname, String pass) {

		String hql="select c from Customer c where c.email=:email and c.pass=:pass";
		Query q=sf.getCurrentSession().createQuery(hql).setParameter("email",uname).setParameter("pass", pass);
		Customer c=(Customer)q.uniqueResult();
		return c;
	}

	@Override
	public int saveCustomer(Customer c) {

		return (int)sf.getCurrentSession().save(c);
	}
	@Override
	public int imageStore(MultipartFile imagefile,Image img) {

		int id=0;
		try
		{
			byte[] bytes=imagefile.getBytes();	
			System.out.println("in try and array len is "+bytes.length);
			
			//	System.out.println("in if");
				System.out.println("img is"+img);
               // img.setImgid(1);
				img.setImage(bytes);
				img.setImgname(imagefile.getOriginalFilename());
				id=(int)sf.getCurrentSession().save(img);
				//System.out.println("in image save controller"+param);
		}catch(Exception ex)
		{
			System.out.println("image storation failed");
		}
		return id;
	}

	@Override
	public Image imageRestore(int imgid) {
	String hql="select i from Image i where i.imgid=:imgid";
    Image img=(Image)sf.getCurrentSession().createQuery(hql).setParameter("imgid",imgid).uniqueResult();
		return img;
	}
	
}
