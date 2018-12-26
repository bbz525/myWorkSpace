package com.jt.pro.dao;

import com.jt.pro.model.EmployeeTask;

import java.util.List;

public interface EmployeeTaskDao {
   List<EmployeeTask> findEmployeeTaskByEmpId(Long empId);
}
