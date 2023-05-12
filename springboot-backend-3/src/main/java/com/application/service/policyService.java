package com.application.service;

import java.util.List;

import com.application.model.Policy;

public interface policyService {
	
	public Policy savePolicy(Policy policy);
	public List<Policy> getAllPolicy();
	public Policy getPolicyById(Integer id);
	public void deletePolicy(Integer id);
	
	public void editPolicy(Policy policy, Integer id);
	

}
