package com.covalense.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.BookIssueBean;

public interface BookAllocateRepository extends CrudRepository<BookIssueBean, Integer>{
	/*
	 * @Query("select e from BookAllotment e where e.returnStatus=:status")
	 * List<BookIssueBean> findAllByStatus(@Param("status") int status); //
	 * 
	 * @Query("select COUNT(b) from BookAllotment b WHERE b.bookId=:id AND b.returnStatus=:status"
	 * ) int getIssuedCopies(@Param("id") Book id,@Param("status")int status );
	 */

}
