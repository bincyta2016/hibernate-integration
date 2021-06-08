package com.sample.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sample.entity.Policy;

@Component
public class PolicyDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	//create
	
	
	@Transactional
	public void createPolicy(Policy p) {
		
		
		this.hibernatetemplate.saveOrUpdate(p);
		 
	}
	
	
	
	public List<Policy> getPolicy(){
		List<Policy> lp=this.hibernatetemplate.loadAll(Policy.class);
		return lp;
	}
	
	
	@Transactional
	public void deletePolicy(int hid) {
		Policy p=this.hibernatetemplate.load(Policy.class, hid);
		this.hibernatetemplate.delete(p);
	}
	
	
	public Policy getPolicy(int pid) {
		return this.hibernatetemplate.get(Policy.class,pid);
	}
   
}
 