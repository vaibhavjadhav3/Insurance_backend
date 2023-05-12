package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>  {

}
