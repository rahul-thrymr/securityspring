package com.security.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class RegisterEntity extends BaseEntity{

	private String name;
	
	private String password;
	
	private String address;
	
	
}
