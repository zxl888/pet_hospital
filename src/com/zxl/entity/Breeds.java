package com.zxl.entity;

public class Breeds {
    private Integer breid;

    private String brename;

    public Integer getBreid() {
        return breid;
    }

    public void setBreid(Integer breid) {
        this.breid = breid;
    }

    public String getBrename() {
        return brename;
    }

    public void setBrename(String brename) {
        this.brename = brename == null ? null : brename.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", breid=").append(breid);
        sb.append(", brename=").append(brename);
        sb.append("]");
        return sb.toString();
    }
}