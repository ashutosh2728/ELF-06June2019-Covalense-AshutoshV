package com.covalense.empspringmvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
@SuppressWarnings("serial")
public class EmployeeExperienceInfoPKBean implements Serializable {

	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean bean;
	@Column(name = "COMPANY_NAME")
	private String companyName;

}
