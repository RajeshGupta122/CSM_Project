package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Emp;

public interface EmpService {

	//Long saveEmp(Emp emp);
	
	void saveEmp(Emp emp);

	 List<Emp> getAllEmps();
	 void deleteEmpById(Long eId);
}
