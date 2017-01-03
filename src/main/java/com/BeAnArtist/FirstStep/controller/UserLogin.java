package com.BeAnArtist.FirstStep.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.BeAnArtist.FirstStep.service.user.UserLoginService;
import com.BeAnArtist.FirstStep.util.StringUtil;

@RequestMapping(value = "/userlogin")
public class UserLogin {
	
	private Map<String, Object> resultMap = new HashMap<String, Object>();
	private int isSuccess;
	
	@Autowired
	private UserLoginService userLoginService;
	
	@RequestMapping(value = "/{userName}/{userPassword}", method = RequestMethod.GET)
	public String login(@PathVariable("userName")String userName, @PathVariable("userPassword")String userPassword){
		if(!userName.equals("illagal") && !userPassword.equals("illegal")){
			isSuccess = userLoginService.countUserNum(userName, StringUtil.string2MD5(userPassword)) == 1 ? 1 : 0;
		}
		resultMap.put("isSuccess", isSuccess);
		System.out.println(isSuccess);
		return "index";
	}

}
