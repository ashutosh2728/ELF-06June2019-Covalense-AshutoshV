package com.covalense.lms.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.lms.dto.BookIssueBean;

public interface BookAllocateRepository extends CrudRepository<BookIssueBean, Integer>{

}
