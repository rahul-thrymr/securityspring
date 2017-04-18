package com.security.entity;

import javax.persistence.ManyToOne;

import com.security.bean.Login;

public class PassEntity {

	private String password;
	
	@ManyToOne
	public Login login;
	
}
