package com.emp.demoServiceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.demoEntity.EmployeeEntity;
import com.emp.demoRepository.EmployeeRepository;
import com.emp.demoService.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	/*
	 * @Override public void saveemp(Long id, String name, String address, Float
	 * salary) { // TODO Auto-generated method stub EmployeeEntity emp= new
	 * EmployeeEntity(); emp.setId(id); emp.setName(name); emp.setAddress(address);
	 * emp.setSalary(salary);
	 * 
	 * repo.save(emp); }
	 */
	@Transactional
	public EmployeeEntity saveemp(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}



}

