package com.nit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
//@NoArgsConstructor
@Data
public class UserResponse {
	private Integer	userId;
	private String	name;
	private String	email;
	private String	location;
}
