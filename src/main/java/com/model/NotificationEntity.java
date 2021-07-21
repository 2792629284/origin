package com.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "notification", schema = "game", catalog = "")
public class NotificationEntity {
    private Integer notifactionId;
    private String notificationTitle;
    private String notificationContent;
    private Integer employeeId;
    private Timestamp createdAt;
    private Timestamp readAt;
    private EmployeeEntity employeeByEmployeeId;

    @Id
    @Column(name = "notifaction_id")
    public Integer getNotifactionId() {
        return notifactionId;
    }

    public void setNotifactionId(Integer notifactionId) {
        this.notifactionId = notifactionId;
    }

    @Basic
    @Column(name = "notification_title")
    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    @Basic
    @Column(name = "notification_content")
    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    @Basic
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "read_at")
    public Timestamp getReadAt() {
        return readAt;
    }

    public void setReadAt(Timestamp readAt) {
        this.readAt = readAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationEntity that = (NotificationEntity) o;
        return Objects.equals(notifactionId, that.notifactionId) && Objects.equals(notificationTitle, that.notificationTitle) && Objects.equals(notificationContent, that.notificationContent) && Objects.equals(employeeId, that.employeeId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(readAt, that.readAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifactionId, notificationTitle, notificationContent, employeeId, createdAt, readAt);
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false, insertable = false, updatable = false)
    public EmployeeEntity getEmployeeByEmployeeId() {
        return employeeByEmployeeId;
    }

    public void setEmployeeByEmployeeId(EmployeeEntity employeeByEmployeeId) {
        this.employeeByEmployeeId = employeeByEmployeeId;
    }
}
