package com.emp.demoService;

import com.emp.demoEntity.EmployeeEntity;

public interface EmployeeService {

	//void saveemp(Long id, String name, String address, Float salary);

	EmployeeEntity saveemp(EmployeeEntity emp);

}
