package com.rto.dao;

import com.rto.pojos.*;

public interface Dao {
	public String RegisterNewUser(UserInfo user);

	public UserInfo validateUser(User login);
}
