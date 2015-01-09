/**
 * Copyright (c) 2011-2015 All Rights Reserved.
 */
package com.summer.domain;

import java.io.Serializable;

/**
 *
 *
 * @author 625289
 * @version $Id: User.java 2015年1月5日 上午11:23:44 $
 * @since 1.0.0
 */
public class User implements Serializable {

	/**  */
	private static final long serialVersionUID = -7467401970387075360L;
	private long id;
	private String name;
	private String pwd;
	private long state;
	private String avatar;
	private String createTime;
	private String userip;
	private String email;
	private String website;

	/**
	 * Getter method for property <tt>id</tt>.
	 * 
	 * @return property value of id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id
	 *            value to be assigned to property id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter method for property <tt>name</tt>.
	 * 
	 * @return property value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for property <tt>name</tt>.
	 * 
	 * @param name
	 *            value to be assigned to property name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for property <tt>pwd</tt>.
	 * 
	 * @return property value of pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * Setter method for property <tt>pwd</tt>.
	 * 
	 * @param pwd
	 *            value to be assigned to property pwd
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * Getter method for property <tt>state</tt>.
	 * 
	 * @return property value of state
	 */
	public long getState() {
		return state;
	}

	/**
	 * Setter method for property <tt>state</tt>.
	 * 
	 * @param state
	 *            value to be assigned to property state
	 */
	public void setState(long state) {
		this.state = state;
	}

	/**
	 * Getter method for property <tt>avatar</tt>.
	 * 
	 * @return property value of avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * Setter method for property <tt>avatar</tt>.
	 * 
	 * @param avatar
	 *            value to be assigned to property avatar
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * Getter method for property <tt>createTime</tt>.
	 * 
	 * @return property value of createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * Setter method for property <tt>createTime</tt>.
	 * 
	 * @param createTime
	 *            value to be assigned to property createTime
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * Getter method for property <tt>userip</tt>.
	 * 
	 * @return property value of userip
	 */
	public String getUserip() {
		return userip;
	}

	/**
	 * Setter method for property <tt>userip</tt>.
	 * 
	 * @param userip
	 *            value to be assigned to property userip
	 */
	public void setUserip(String userip) {
		this.userip = userip;
	}

	/**
	 * Getter method for property <tt>email</tt>.
	 * 
	 * @return property value of email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for property <tt>email</tt>.
	 * 
	 * @param email
	 *            value to be assigned to property email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method for property <tt>website</tt>.
	 * 
	 * @return property value of website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Setter method for property <tt>website</tt>.
	 * 
	 * @param website
	 *            value to be assigned to property website
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

}
