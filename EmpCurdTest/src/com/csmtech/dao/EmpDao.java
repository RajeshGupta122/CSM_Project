package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.Emp;

public interface EmpDao {

	//Long saveEmp(Emp emp);
	
	void saveEmp(Emp emp);

	List<Emp> getAllEmps();
	void deleteEmpById(Long eId);

}
