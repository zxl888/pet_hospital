package com.zxl.entity;

import java.util.Date;

public class Clinics {
    private Integer cid;

    private Integer pid;

    private Date ctime;

    private String cdetails;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCdetails() {
        return cdetails;
    }

    public void setCdetails(String cdetails) {
        this.cdetails = cdetails == null ? null : cdetails.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", pid=").append(pid);
        sb.append(", ctime=").append(ctime);
        sb.append(", cdetails=").append(cdetails);
        sb.append("]");
        return sb.toString();
    }
}