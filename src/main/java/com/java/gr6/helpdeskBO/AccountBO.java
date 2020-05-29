package com.java.gr6.helpdeskBO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ACCOUNT")
public class AccountBO {
    private Long accountId;
    private String userName;
    private String password;
    private String roleCode;
    private String empCode;
    private int isActivated ; // 0 : chưa kích hoạt || 1 : đang chờ kích hoạt || 2 : đã kích hoạt
    private Date createDate;
    private int status; // 1 : đang hoạt độgn || 0 : ngừng hoạt động

    public AccountBO() {
        super();
    }

    public AccountBO(Long accountId, String userName, String password, String roleCode, String empCode, int isActivated, Date createDate, int status) {
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
        this.roleCode = roleCode;
        this.empCode = empCode;
        this.isActivated = isActivated;
        this.createDate = createDate;
        this.status = status;
    }

    @Id
    @Column(name = "ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Column(name = "USERNAME", columnDefinition = "nvarchar (70)")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "PASSWORD", columnDefinition = "nvarchar (70)")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "ROLE_CODE", columnDefinition = "nvarchar (100)")
    public String getRoleCode() {
        return roleCode;
    }


    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Column(name = "EMPLOYEE_CODE", columnDefinition = "nvarchar (100)")
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    @Column(name = "IS_ACTIVARED")
    public int getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(int isActivated) {
        this.isActivated = isActivated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", length = 19)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "STATUS")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
