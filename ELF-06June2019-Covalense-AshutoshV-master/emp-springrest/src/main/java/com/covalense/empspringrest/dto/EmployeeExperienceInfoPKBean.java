package com.covalense.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
@SuppressWarnings("serial")
public class EmployeeExperienceInfoPKBean implements Serializable {

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean bean;
	@Column(name = "COMPANY_NAME")
	private String companyName;

	public EmployeeInfoBean getBean() {
		return bean;
	}

	public void setBean(EmployeeInfoBean bean) {
		this.bean = bean;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
