package com.covalense.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.springboot.dto.EmployeeInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {
	

}
