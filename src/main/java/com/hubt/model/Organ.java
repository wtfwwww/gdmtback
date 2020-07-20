package com.hubt.model;

import java.util.Date;
import java.util.List;

public class Organ {
	private String organUuid;

	private String organCode;

	private String organName;

	private String organType;

	private String inUse;

	private String parentUuid;

	private String status;

	private String modifierid;

	private Date modtime;

	private String description;

	private String accountCode;

	private String shortname;

	private Organ parent;
	private List<Organ> Children;

	public Organ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organ(String organUuid, String organCode, String organName, String organType, String inUse,
			String parentUuid, String status, String modifierid, Date modtime, String description, String accountCode,
			String shortname, Organ parent, List<Organ> children) {
		super();
		this.organUuid = organUuid;
		this.organCode = organCode;
		this.organName = organName;
		this.organType = organType;
		this.inUse = inUse;
		this.parentUuid = parentUuid;
		this.status = status;
		this.modifierid = modifierid;
		this.modtime = modtime;
		this.description = description;
		this.accountCode = accountCode;
		this.shortname = shortname;
		this.parent = parent;
		Children = children;
	}

	public Organ getParent() {
		return parent;
	}

	public void setParent(Organ parent) {
		this.parent = parent;
	}

	public List<Organ> getChildren() {
		return Children;
	}

	public void setChildren(List<Organ> children) {
		Children = children;
	}

	public String getOrganUuid() {
		return organUuid;
	}

	public void setOrganUuid(String organUuid) {
		this.organUuid = organUuid == null ? null : organUuid.trim();
	}

	public String getOrganCode() {
		return organCode;
	}

	public void setOrganCode(String organCode) {
		this.organCode = organCode == null ? null : organCode.trim();
	}

	public String getOrganName() {
		return organName;
	}

	public void setOrganName(String organName) {
		this.organName = organName == null ? null : organName.trim();
	}

	public String getOrganType() {
		return organType;
	}

	public void setOrganType(String organType) {
		this.organType = organType == null ? null : organType.trim();
	}

	public String getInUse() {
		return inUse;
	}

	public void setInUse(String inUse) {
		this.inUse = inUse == null ? null : inUse.trim();
	}

	public String getParentUuid() {
		return parentUuid;
	}

	public void setParentUuid(String parentUuid) {
		this.parentUuid = parentUuid == null ? null : parentUuid.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getModifierid() {
		return modifierid;
	}

	public void setModifierid(String modifierid) {
		this.modifierid = modifierid == null ? null : modifierid.trim();
	}

	public Date getModtime() {
		return modtime;
	}

	public void setModtime(Date modtime) {
		this.modtime = modtime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode == null ? null : accountCode.trim();
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname == null ? null : shortname.trim();
	}
}