package com.covalense.lms.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.lms.dto.BookInfoBean;

public interface LibrarianRepository extends CrudRepository<BookInfoBean, Integer>{

}
