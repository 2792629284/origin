package com.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "game", catalog = "")
public class EmployeeEntity {
    private Integer employeeId;
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private Timestamp birthday;
    private Timestamp hireDate;
    private Long telephone;
    private Integer status;
    private Integer job;
    private Integer departmentId;
    private String photo;
    private Integer level;
    private Collection<DepartmentEntity> departmentsByEmployeeId;
    private AuthorityEntity authorityByLevel;
    private Collection<NotificationEntity> notificationsByEmployeeId;

    @Id
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "hire_date")
    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "telephone")
    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "job")
    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    @Basic
    @Column(name = "department_id")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(birthday, that.birthday) && Objects.equals(hireDate, that.hireDate) && Objects.equals(telephone, that.telephone) && Objects.equals(status, that.status) && Objects.equals(job, that.job) && Objects.equals(departmentId, that.departmentId) && Objects.equals(photo, that.photo) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, username, password, name, gender, birthday, hireDate, telephone, status, job, departmentId, photo, level);
    }

    @OneToMany(mappedBy = "employeeByManagerEmployeeId")
    public Collection<DepartmentEntity> getDepartmentsByEmployeeId() {
        return departmentsByEmployeeId;
    }

    public void setDepartmentsByEmployeeId(Collection<DepartmentEntity> departmentsByEmployeeId) {
        this.departmentsByEmployeeId = departmentsByEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "level", referencedColumnName = "authority_id", insertable = false, updatable = false)
    public AuthorityEntity getAuthorityByLevel() {
        return authorityByLevel;
    }

    public void setAuthorityByLevel(AuthorityEntity authorityByLevel) {
        this.authorityByLevel = authorityByLevel;
    }

    @OneToMany(mappedBy = "employeeByEmployeeId")
    public Collection<NotificationEntity> getNotificationsByEmployeeId() {
        return notificationsByEmployeeId;
    }

    public void setNotificationsByEmployeeId(Collection<NotificationEntity> notificationsByEmployeeId) {
        this.notificationsByEmployeeId = notificationsByEmployeeId;
    }

    public interface someContent{
         Integer getEmployeeId();
         String getUsername();
         String getPassword();
         String getName();
        Integer getGender();
        Timestamp getBirthday();
        Timestamp getHireDate();
        Long getTelephone();
        Integer getStatus();
        Integer getJob();
        Integer getDepartmentId();
        String getPhoto();
        Integer getLevel();
        Collection<DepartmentEntity.someContent2> getDepartmentsByEmployeeId();
//        AuthorityEntity getAuthorityByLevel();
//        Collection<NotificationEntity> getNotificationsByEmployeeId();

    }
}
