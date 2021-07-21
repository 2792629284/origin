package com.repository;

import com.model.EmployeeEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path="userwc")
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>, JpaSpecificationExecutor<EmployeeEntity> {
    List<EmployeeEntity.someContent> findByUsername(String username);

//    Page<EmployeeEntity.someContent> findAll(Example example, Pageable pageable);
}
