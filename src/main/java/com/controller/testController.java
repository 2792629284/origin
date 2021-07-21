package com.controller;

import com.model.EmployeeEntity;
import com.model.Userlogin;
import com.projection.UserloginInfo;
import com.repository.EmployeeRepository;
import com.repository.UserloginRepository;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserloginRepository userloginRepository;

    @RequestMapping("/test1")
    public Page<EmployeeEntity> findAllSelective(
            EmployeeEntity employeeEntity,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "15") Integer pageSize
    ){

        return employeeService.findAllSelective(employeeEntity,pageNum-1,pageSize);
    }

    @RequestMapping("/test2")
    public List<EmployeeEntity.someContent> test(@RequestParam("username") String username){
        return employeeRepository.findByUsername(username);
    }

    @RequestMapping("/test3")
    public List<Userlogin> test3(){
        return userloginRepository.findAll();
    }

    @RequestMapping("/test4")
    public UserloginInfo test4(String username){
        return userloginRepository.findByUsername(username);
    }


}