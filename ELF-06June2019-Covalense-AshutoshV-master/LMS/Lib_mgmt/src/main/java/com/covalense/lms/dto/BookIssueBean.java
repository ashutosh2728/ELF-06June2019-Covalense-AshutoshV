package com.covalense.lms.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
@SuppressWarnings("serial")
@JsonRootName(value = "book_issue_details")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@Table(name = "book_issue_details")
@Entity
@Data
public class BookIssueBean  {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	/*
	 * @JsonIgnore
	 * 
	 * @JoinColumn(name = "userId",unique=true,nullable=false)
	 * 
	 * @OneToOne private UserInfoBean userInfoBean;
	 */
	@ManyToOne
	 @JoinColumn(name = "USER_ID") 
	 private UserInfoBean userId;
	/*
	 * @JoinTable(name = "book_issue_details", joinColumns = { @JoinColumn(name =
	 * "USER_ID") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "USER_ID") })
	 */ 
	 
	@ManyToOne
	 @JoinColumn(name = "BOOK_ID") 
	private BookInfoBean bookId;
	@Column(name = "ISSUE_DATE")
	private Date issueDate;
	@Column(name = "RETURN_DATE")
	private Date returnDate;
	@Column(name = "FINE")
	private Double fine;
}
