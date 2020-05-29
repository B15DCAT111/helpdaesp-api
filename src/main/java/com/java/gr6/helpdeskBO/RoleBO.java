package com.java.gr6.helpdeskBO;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class RoleBO {
    private Long roleId;
    private String roleName;
    private String roleCode ;

    public RoleBO() {
        super();
    }

    public RoleBO(Long roleId, String roleName, String roleCode) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleCode = roleCode;
    }

    @Id
    @Column(name = "ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "ROLE_NAME", columnDefinition = "nvarchar (100)")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Column(name = "ROLE_CODE", columnDefinition = "nvarchar (100)")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
