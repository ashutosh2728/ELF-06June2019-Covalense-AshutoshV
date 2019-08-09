package com.covalense.empspringmvc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@Table(name = "employee_info")
@Entity
@Data
public class EmployeeInfoBean implements Serializable {

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfo;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.bean")
	private List<EmployeeAddressInfoBean> addressInfoBeanList;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.bean")
	private List<EmployeeEducationalInfoBean> employeeEducationalInfoBean;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperienceInfoPKBean.bean")
	private List<EmployeeExperienceInfoBean> employeeExperienceInfoBean;

	@LazyCollection(LazyCollectionOption.FALSE)

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "employeeInfoBeans")
	private List<TrainingInfoBean> trainingInfoBean;

	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private Integer age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private Double salary;
	@Column(name = "phone")
	private Integer phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private Integer accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	/*
	 * @Column(name = "dept_id") private Integer departmentId;
	 */
	/*
	 * @Column(name = "mngr_Id") private Integer managerId;
	 */
	@Column(name = "password")
	private String password;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MNGR_ID", referencedColumnName = "id")
	private EmployeeInfoBean mngId;

}
