package com.covalense.lms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("user-response")
public class AdminResponse {
	@JsonProperty("status-code")
	private int statusCode;
	private String message;
	private String description;
	private List<UserInfoBean> beans;
}
