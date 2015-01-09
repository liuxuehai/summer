/**
 * Copyright (c) 2011-2015 All Rights Reserved.
 */
package com.summer.domain.service.impl;

import com.summer.domain.User;
import com.summer.domain.service.IUserService;

/**
 *
 *
 * @author 625289
 * @version $Id: UserService.java 2015年1月5日 下午1:15:54 $
 * @since 1.0.0
 */
public class UserService implements IUserService {

	/** 
	 * @see com.summer.domain.service.IUserService#getUser()
	 */
	@Override
	public User getUser() {
		User user =new User();
		user.setCreateTime("ererere");
		return user;
	}

}
