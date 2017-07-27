package com.yunuo.po;

public class PermissionT {
    private Long id;

    private String func;

    private Long permission;

    private String funcgroup;

    private Double requirement;

    private String person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func == null ? null : func.trim();
    }

    public Long getPermission() {
        return permission;
    }

    public void setPermission(Long permission) {
        this.permission = permission;
    }

    public String getFuncgroup() {
        return funcgroup;
    }

    public void setFuncgroup(String funcgroup) {
        this.funcgroup = funcgroup == null ? null : funcgroup.trim();
    }

    public Double getRequirement() {
        return requirement;
    }

    public void setRequirement(Double requirement) {
        this.requirement = requirement;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }
}