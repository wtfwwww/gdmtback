package com.hubt.model;

public class Duty {
	private String dutyid;
	private String name;
	private String organUuid;
	private String roleUuid;
	private Organ organ;
	private Role role;

	public Duty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Duty(String dutyid, String name, String organUuid, String roleUuid, Organ organ, Role role) {
		super();
		this.dutyid = dutyid;
		this.name = name;
		this.organUuid = organUuid;
		this.roleUuid = roleUuid;
		this.organ = organ;
		this.role = role;
	}

	public String getOrganUuid() {
		return organUuid;
	}

	public void setOrganUuid(String organUuid) {
		this.organUuid = organUuid;
	}

	public String getRoleUuid() {
		return roleUuid;
	}

	public void setRoleUuid(String roleUuid) {
		this.roleUuid = roleUuid;
	}

	public String getDutyid() {
		return dutyid;
	}

	public void setDutyid(String dutyid) {
		this.dutyid = dutyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organ getOrgan() {
		return organ;
	}

	public void setOrgan(Organ organ) {
		this.organ = organ;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
