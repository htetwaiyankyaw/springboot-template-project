package com.spring.rest.zconfig.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvalidField {
	private String fieldName;
	private String mesageCode;
	private String mesage;
}
