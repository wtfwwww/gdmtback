package com.hubt.model;

public class role {
	private String roleUuid;

    private String roleId;

    private String roleName;

    public String getRoleUuid() {
        return roleUuid;
    }

    public role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public role(String roleUuid, String roleId, String roleName) {
		super();
		this.roleUuid = roleUuid;
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid == null ? null : roleUuid.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}
