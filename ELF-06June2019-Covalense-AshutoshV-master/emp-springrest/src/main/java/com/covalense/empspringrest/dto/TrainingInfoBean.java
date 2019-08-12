package com.covalense.empspringrest.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "training_info")
public class TrainingInfoBean implements Serializable {

	@Id
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "COURSE_NAME")
	private String courseName;
	@Column(name = "DURATION")
	private String duration;
	@Column(name = "COURSE_TYPE")
	private String courseType;

	@XmlTransient
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", joinColumns = { @JoinColumn(name = "COURSE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ID") })
	List<EmployeeInfoBean> employeeInfoBeans;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public List<EmployeeInfoBean> getEmployeeInfoBeans() {
		return employeeInfoBeans;
	}

	public void setEmployeeInfoBeans(List<EmployeeInfoBean> employeeInfoBeans) {
		this.employeeInfoBeans = employeeInfoBeans;
	}

}// End of TrainingInfoBean
