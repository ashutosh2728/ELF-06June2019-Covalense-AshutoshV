package com.covalense.empspringmvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class EmployeeAddressPKBean implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean bean;

	@Column(name = "ADDRESSTYPE")
	private String addressType;

	public EmployeeInfoBean getBean() {
		return bean;
	}

	public void setBean(EmployeeInfoBean bean) {
		this.bean = bean;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}
