package com.java.gr6.helpdeskDTO;

public class RoleDTO {
	private Long roleId;
	private String roleName;
	private String roleCode;

	public RoleDTO() {
		// TODO Auto-generated constructor stub
	}

	public RoleDTO(Long roleId, String roleName, String roleCode) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleCode = roleCode;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

}
