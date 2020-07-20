package com.hubt.model;


import java.util.Date;

public class User {
	private String userUuid;

    private String id;

    private String username;

    private String password;

    private String email;

    private String mobile;

    private Short enabled;

    private Short accountNonExpired;

    private Short credentialsNonExpired;

    private Short accountNonLocked;

    private String organUuid;

    private String niceName;

    private Short isAdmin;

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
    
    private Organ organ;
    
    

    public Organ getOrgan() {
		return organ;
	}

	public void setOrgan(Organ organ) {
		this.organ = organ;
	}

	public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public Short getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Short accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Short getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Short credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Short getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Short accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getOrganUuid() {
        return organUuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organUuid = organUuid == null ? null : organUuid.trim();
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName == null ? null : niceName.trim();
    }

    public Short getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Short isAdmin) {
        this.isAdmin = isAdmin;
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
        this.pwdque = pwdque == null ? null : pwdque.trim();
    }

    public String getPwdans() {
        return pwdans;
    }

    public void setPwdans(String pwdans) {
        this.pwdans = pwdans == null ? null : pwdans.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        this.modifierid = modifierid == null ? null : modifierid.trim();
    }

    public Short getIsSum() {
        return isSum;
    }

    public void setIsSum(Short isSum) {
        this.isSum = isSum;
    }
	

}

