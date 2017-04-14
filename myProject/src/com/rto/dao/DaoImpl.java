package com.rto.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static com.rto.utils.RandPasswordGenerator.*;
import com.rto.pojos.*;

@Repository
public class DaoImpl implements Dao{
	@Autowired
	private SessionFactory sf;
	
	public String RegisterNewUser(UserInfo user1){
		String hql="from UserInfo where email=:em";
		System.out.println("in RegisterNewUser..1");
		System.out.println(user1.getEmail());
		String emi=user1.getEmail();
		String id=null;
		UserInfo user2 = (UserInfo)sf.getCurrentSession().createQuery(hql).setParameter("em",emi).uniqueResult();
		if(user2==null){
			User user3=new User();
			user3.setPassword(generatePassword());
			user1.setUser(user3);
			System.out.println("in RegisterNewUser..2");
			
			id= (String)sf.getCurrentSession().save(user1);
			System.out.println("id is"+id);
			return id;
		}
		
		return id;
	}

	@Override
	public UserInfo validateUser(User login) {
		String hql="select u from UserInfo u ,User l where u.email=:em and l.password =:pw";
		UserInfo user =(UserInfo) sf.getCurrentSession().createQuery(hql).
				setString("em", login.getUserInfo().getEmail()).setString("pw", login.getPassword()).uniqueResult();
		return user;
	}
}
