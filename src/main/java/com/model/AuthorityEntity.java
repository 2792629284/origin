package com.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "authority", schema = "game", catalog = "")
public class AuthorityEntity {
    private Integer authorityId;
    private String authorityName;
    private Collection<EmployeeEntity> employeesByAuthorityId;

    @Id
    @Column(name = "authority_id")
    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    @Basic
    @Column(name = "authority_name")
    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorityEntity that = (AuthorityEntity) o;
        return Objects.equals(authorityId, that.authorityId) && Objects.equals(authorityName, that.authorityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorityId, authorityName);
    }

    @OneToMany(mappedBy = "authorityByLevel")
    public Collection<EmployeeEntity> getEmployeesByAuthorityId() {
        return employeesByAuthorityId;
    }

    public void setEmployeesByAuthorityId(Collection<EmployeeEntity> employeesByAuthorityId) {
        this.employeesByAuthorityId = employeesByAuthorityId;
    }

}
