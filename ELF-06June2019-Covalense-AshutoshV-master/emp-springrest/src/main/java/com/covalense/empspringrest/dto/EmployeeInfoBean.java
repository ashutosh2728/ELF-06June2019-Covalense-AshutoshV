package com.covalense.empspringrest.dto;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@SuppressWarnings("serial")
@XmlRootElement(name = "employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "employee_info")
@Entity
public class EmployeeInfoBean implements Serializable {

	@XmlElement(name = "other-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfo;

	@XmlElement(name = "address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.bean")
	private List<EmployeeAddressInfoBean> addressInfoBeanList;

	@XmlElement(name = "education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.bean")
	private List<EmployeeEducationalInfoBean> employeeEducationalInfoBean;

	@XmlElement(name = "experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperienceInfoPKBean.bean")
	private List<EmployeeExperienceInfoBean> employeeExperienceInfoBean;

	@XmlElement(name = "training-info")
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
	@Column(name = "password")
	private String password;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MNGR_ID", referencedColumnName = "id")
	private EmployeeInfoBean mngId;

	public EmployeeOtherInfoBean getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(EmployeeOtherInfoBean otherInfo) {
		this.otherInfo = otherInfo;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBeanList() {
		return addressInfoBeanList;
	}

	public void setAddressInfoBeanList(List<EmployeeAddressInfoBean> addressInfoBeanList) {
		this.addressInfoBeanList = addressInfoBeanList;
	}

	public List<EmployeeEducationalInfoBean> getEmployeeEducationalInfoBean() {
		return employeeEducationalInfoBean;
	}

	public void setEmployeeEducationalInfoBean(List<EmployeeEducationalInfoBean> employeeEducationalInfoBean) {
		this.employeeEducationalInfoBean = employeeEducationalInfoBean;
	}

	public List<EmployeeExperienceInfoBean> getEmployeeExperienceInfoBean() {
		return employeeExperienceInfoBean;
	}

	public void setEmployeeExperienceInfoBean(List<EmployeeExperienceInfoBean> employeeExperienceInfoBean) {
		this.employeeExperienceInfoBean = employeeExperienceInfoBean;
	}

	public List<TrainingInfoBean> getTrainingInfoBean() {
		return trainingInfoBean;
	}

	public void setTrainingInfoBean(List<TrainingInfoBean> trainingInfoBean) {
		this.trainingInfoBean = trainingInfoBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getMngId() {
		return mngId;
	}

	public void setMngId(EmployeeInfoBean mngId) {
		this.mngId = mngId;
	}

}
