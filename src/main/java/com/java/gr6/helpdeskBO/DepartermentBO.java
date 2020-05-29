package com.java.gr6.helpdeskBO;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class DepartermentBO {
    private Long departmentId;
    private String departmentName;
    private String getDepartmentCode;

    public DepartermentBO() {
        super();
    }

    public DepartermentBO(Long departmentId, String departmentName, String getDepartmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        String getDepartmentCode1 = getDepartmentCode;
        this.getDepartmentCode = getDepartmentCode1;
    }

    @Id
    @Column(name = "DEPARTMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Column(name = "DEPARTMENT_NAME", columnDefinition = "nvarchar (100)")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Column(name = "DEPARTMENT_CODE", columnDefinition = "nvarchar (100)")
    public String getGetDepartmentCode() {
        return getDepartmentCode;
    }

    public void setGetDepartmentCode(String getDepartmentCode) {
        this.getDepartmentCode = getDepartmentCode;
    }
}
