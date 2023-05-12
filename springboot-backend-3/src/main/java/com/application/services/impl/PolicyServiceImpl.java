package com.application.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Policy;
import com.application.repository.PolicyRepository;

import com.application.service.policyService;

@Service
public class PolicyServiceImpl implements policyService{
	
	@Autowired
	private PolicyRepository policyrepo;

	@Override
	public Policy savePolicy(Policy policy)
	{
		// TODO Auto-generated method stub
		return policyrepo.save(policy);
	}

	@Override
	public List<Policy> getAllPolicy() {
		// TODO Auto-generated method stub
		return policyrepo.findAll();
	}

	@Override
	public Policy getPolicyById(Integer id) {
		// TODO Auto-generated method stub
		return policyrepo.findById(id).get();
		
	}

	@Override
	public void deletePolicy(Integer id) {
		
		policyrepo.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editPolicy(Policy policy, Integer id) {
	    Policy oldPolicy = policyrepo.findById(id).get();
	    oldPolicy.setPolicyName(policy.getPolicyName());
	    oldPolicy.setPolicyDsc(policy.getPolicyDsc());
	    oldPolicy.setCategory(policy.getCategory());
	    oldPolicy.setPremium(policy.getPremium());
	    policyrepo.save(oldPolicy);
	}

	

}
