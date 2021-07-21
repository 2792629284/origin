package com.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "department", schema = "game", catalog = "")
public class DepartmentEntity {
    private Integer departmentId;
    private String departmentName;
    private Integer departmentStatus;
    private Integer managerEmployeeId;
    private EmployeeEntity employeeByManagerEmployeeId;

    @Id
    @Column(name = "department_id")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "department_name")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "department_status")
    public Integer getDepartmentStatus() {
        return departmentStatus;
    }

    public void setDepartmentStatus(Integer departmentStatus) {
        this.departmentStatus = departmentStatus;
    }

    @Basic
    @Column(name = "manager_employee_id")
    public Integer getManagerEmployeeId() {
        return managerEmployeeId;
    }

    public void setManagerEmployeeId(Integer managerEmployeeId) {
        this.managerEmployeeId = managerEmployeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return Objects.equals(departmentId, that.departmentId) && Objects.equals(departmentName, that.departmentName) && Objects.equals(departmentStatus, that.departmentStatus) && Objects.equals(managerEmployeeId, that.managerEmployeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, departmentName, departmentStatus, managerEmployeeId);
    }

    @ManyToOne
    @JoinColumn(name = "manager_employee_id", referencedColumnName = "employee_id", insertable = false, updatable = false)
    public EmployeeEntity getEmployeeByManagerEmployeeId() {
        return employeeByManagerEmployeeId;
    }

    public void setEmployeeByManagerEmployeeId(EmployeeEntity employeeByManagerEmployeeId) {
        this.employeeByManagerEmployeeId = employeeByManagerEmployeeId;
    }

    public interface someContent2{
        Integer getDepartmentId();
        String getDepartmentName();
        Integer getDepartmentStatus();
        Integer getManagerEmployeeId();
    }
}
