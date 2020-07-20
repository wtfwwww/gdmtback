package com.hubt.model;

public class RoleOrgan {
    private Integer dutyid;

    private String name;

    private String organ_uuid;

    private String role_uuid;

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrganUuid() {
        return organ_uuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organ_uuid = organUuid == null ? null : organUuid.trim();
    }

    public String getRoleUuid() {
        return role_uuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.role_uuid = roleUuid;
    }
}