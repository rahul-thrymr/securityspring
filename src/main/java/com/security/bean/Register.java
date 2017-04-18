package com.security.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class Register extends BaseBean{

	private String name;
	
	private String password;
	
	private String address;
}
