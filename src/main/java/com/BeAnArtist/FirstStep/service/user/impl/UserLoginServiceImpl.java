package com.BeAnArtist.FirstStep.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.BeAnArtist.FirstStep.dao.user.UserLoginDao;
import com.BeAnArtist.FirstStep.service.user.UserLoginService;

@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired
	@Qualifier("userLoginDao")
	private UserLoginDao userLoginDao;

	@Override
	public int countUserNum(String userName, String userPassword) {
		return userLoginDao.countUserNum(userName, userPassword);
	}

}
