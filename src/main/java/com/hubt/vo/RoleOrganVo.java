package com.hubt.vo;

import com.hubt.model.Organ;
import com.hubt.model.Role;

public class RoleOrganVo {
	
	private String dutyid;
	
	private String name;
	
	private String organ_uuid;
	
	private String role_uuid;
	
	private String organ_name;
	
	
	private String role_name;
	
	private Organ organ;
	
	private Role role;

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

	public String getOrgan_uuid() {
		return organ_uuid;
	}

	public void setOrgan_uuid(String organ_uuid) {
		this.organ_uuid = organ_uuid;
	}

	public String getRole_uuid() {
		return role_uuid;
	}

	public void setRole_uuid(String role_uuid) {
		this.role_uuid = role_uuid;
	}

	public String getOrgan_name() {
		return organ_name;
	}

	public void setOrgan_name(String organ_name) {
		this.organ_name = organ_name;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
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
