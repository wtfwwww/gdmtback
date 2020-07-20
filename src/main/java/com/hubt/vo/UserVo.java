package com.hubt.vo;

import java.util.Date;

import com.hubt.model.User;

public class UserVo extends User{
	
	private String user_uuid;

    private String id;

    private String username;

    private String password;

    private String email;

    private String mobile;

    private Short enabled;

    private Short account_non_expired;

    private Short credentials_non_expired;

    private Short account_non_locked;

    private String organ_uuid;

    private String nice_name;

    private Short is_admin;

    private Short maximumsessions;

    private Date registerdate;

    private Date lastlogintime;

    private String pwdque;

    private String pwdans;

    private String remark;

    private String depid;

    private String status;

    private Date modtime;

    private String modifierid;

    private Short isSum;
	
	private String organ_name;

	public String getUser_uuid() {
		return user_uuid;
	}

	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Short getEnabled() {
		return enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	public Short getAccount_non_expired() {
		return account_non_expired;
	}

	public void setAccount_non_expired(Short account_non_expired) {
		this.account_non_expired = account_non_expired;
	}

	public Short getCredentials_non_expired() {
		return credentials_non_expired;
	}

	public void setCredentials_non_expired(Short credentials_non_expired) {
		this.credentials_non_expired = credentials_non_expired;
	}

	public Short getAccount_non_locked() {
		return account_non_locked;
	}

	public void setAccount_non_locked(Short account_non_locked) {
		this.account_non_locked = account_non_locked;
	}

	public String getOrgan_uuid() {
		return organ_uuid;
	}

	public void setOrgan_uuid(String organ_uuid) {
		this.organ_uuid = organ_uuid;
	}

	public String getNice_name() {
		return nice_name;
	}

	public void setNice_name(String nice_name) {
		this.nice_name = nice_name;
	}

	public Short getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Short is_admin) {
		this.is_admin = is_admin;
	}

	public Short getMaximumsessions() {
		return maximumsessions;
	}

	public void setMaximumsessions(Short maximumsessions) {
		this.maximumsessions = maximumsessions;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public Date getLastlogintime() {
		return lastlogintime;
	}

	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getPwdque() {
		return pwdque;
	}

	public void setPwdque(String pwdque) {
		this.pwdque = pwdque;
	}

	public String getPwdans() {
		return pwdans;
	}

	public void setPwdans(String pwdans) {
		this.pwdans = pwdans;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getModtime() {
		return modtime;
	}

	public void setModtime(Date modtime) {
		this.modtime = modtime;
	}

	public String getModifierid() {
		return modifierid;
	}

	public void setModifierid(String modifierid) {
		this.modifierid = modifierid;
	}

	public Short getIsSum() {
		return isSum;
	}

	public void setIsSum(Short isSum) {
		this.isSum = isSum;
	}

	public String getOrgan_name() {
		return organ_name;
	}

	public void setOrgan_name(String organ_name) {
		this.organ_name = organ_name;
	}
	
	
}
