package com.security.entity;

import java.util.List;

import javax.persistence.OneToMany;

import com.security.bean.Pass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginEntity extends BaseEntity{

	private String userName;
	
	
	private String password;
}
