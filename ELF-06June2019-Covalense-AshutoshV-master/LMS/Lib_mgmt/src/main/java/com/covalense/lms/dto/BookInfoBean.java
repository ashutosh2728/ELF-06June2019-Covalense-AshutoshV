package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "book_details")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookId")
@Table(name = "book_details")
@Entity
@Data
public class BookInfoBean implements Serializable {
	@JsonProperty(value = "book-Issue-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookId")
	private List<BookIssueBean> bookIssueBeanList;
	@Id
	@Column(name = "BOOK_ID")
	private Integer bookId;
	@Column(name = "BOOK_NAME")
	private String bookName;
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "PUBLICATIONS")
	private String publications;
	@Column(name = "TOTAL_NO_OF_BOOKS")
	private Integer totalBooks;
	@Column(name = "AVAILABLE_NO_OF_BOOKS")
	private Integer availableCount;

}
