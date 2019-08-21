package com.covalense.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value = "book_details")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookId")
@Table(name = "book_details")
@Entity
@Data
public class BookInfoBean {
	@Id
	@Column(name = "BOOK_ID")
	private int bookId;
	@Column(name = "BOOK_NAME")
	private String bookName;
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "PUBLICATIONS")
	private String publications;
	@Column(name = "TOTAL_NO_OF_BOOKS")
	private int totalBooks;
	@Column(name = "AVAILABLE_NO_OF_BOOKS")
	private int availableCount;

}
