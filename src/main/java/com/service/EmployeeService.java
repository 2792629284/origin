package com.service;

import com.model.EmployeeEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    Page<EmployeeEntity> findAllSelective(EmployeeEntity employeeEntity, Integer pageNum, Integer pageSize);
}
