package com.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "todo_list", schema = "game", catalog = "")
public class TodoListEntity {
    private Integer todoId;
    private String todoTitle;
    private String todoContent;
    private Integer employeeId;

    @Id
    @Column(name = "todo_id")
    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    @Basic
    @Column(name = "todo_title")
    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    @Basic
    @Column(name = "todo_content")
    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    @Basic
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoListEntity that = (TodoListEntity) o;
        return Objects.equals(todoId, that.todoId) && Objects.equals(todoTitle, that.todoTitle) && Objects.equals(todoContent, that.todoContent) && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(todoId, todoTitle, todoContent, employeeId);
    }
}
