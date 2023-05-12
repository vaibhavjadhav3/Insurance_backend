package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
