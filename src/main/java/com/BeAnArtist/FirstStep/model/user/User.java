package com.BeAnArtist.FirstStep.model.user;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8287470489682109976L;

	private long userId;

	private String userName;

	private String userPassword;

	private Integer userSex;

	private String userDesc;

	private String userWeChat;

	private String userMobile;

	private Integer userType;

	private String userAddress;

	private Integer userStatus;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public String getUserWeChat() {
		return userWeChat;
	}

	public void setUserWeChat(String userWeChat) {
		this.userWeChat = userWeChat;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

}
