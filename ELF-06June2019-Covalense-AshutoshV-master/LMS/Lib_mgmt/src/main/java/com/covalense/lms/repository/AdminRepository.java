package com.covalense.lms.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.lms.dto.UserInfoBean;

public interface AdminRepository extends CrudRepository<UserInfoBean, Integer> {

}
