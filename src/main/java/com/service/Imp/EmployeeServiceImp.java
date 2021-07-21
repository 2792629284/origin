package com.service.Imp;

import com.model.EmployeeEntity;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<EmployeeEntity> findAllSelective(EmployeeEntity employeeEntity, Integer pageNum, Integer pageSize) {
        Pageable pageable =  PageRequest.of(pageNum,pageSize);
        return employeeRepository.findAll(Example.of(employeeEntity),pageable);
    }
    }