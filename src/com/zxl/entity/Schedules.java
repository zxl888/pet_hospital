package com.zxl.entity;

import java.util.Date;

public class Schedules {
    private Integer scid;

    private Integer docid;

    private Date duty;

    private Integer deptid;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Date getDuty() {
        return duty;
    }

    public void setDuty(Date duty) {
        this.duty = duty;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scid=").append(scid);
        sb.append(", docid=").append(docid);
        sb.append(", duty=").append(duty);
        sb.append(", deptid=").append(deptid);
        sb.append("]");
        return sb.toString();
    }
}