package com.zxl.entity;

import java.util.Date;

public class Appointments {
    private Integer appid;

    private String appmaster;

    private String appidcard;

    private String appphone;

    private Integer docid;

    private Integer deptid;

    private Date appodate;

    private String appotime;

    private Date appcreatetime;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getAppmaster() {
        return appmaster;
    }

    public void setAppmaster(String appmaster) {
        this.appmaster = appmaster == null ? null : appmaster.trim();
    }

    public String getAppidcard() {
        return appidcard;
    }

    public void setAppidcard(String appidcard) {
        this.appidcard = appidcard == null ? null : appidcard.trim();
    }

    public String getAppphone() {
        return appphone;
    }

    public void setAppphone(String appphone) {
        this.appphone = appphone == null ? null : appphone.trim();
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getAppodate() {
        return appodate;
    }

    public void setAppodate(Date appodate) {
        this.appodate = appodate;
    }

    public String getAppotime() {
        return appotime;
    }

    public void setAppotime(String appotime) {
        this.appotime = appotime == null ? null : appotime.trim();
    }

    public Date getAppcreatetime() {
        return appcreatetime;
    }

    public void setAppcreatetime(Date appcreatetime) {
        this.appcreatetime = appcreatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appid=").append(appid);
        sb.append(", appmaster=").append(appmaster);
        sb.append(", appidcard=").append(appidcard);
        sb.append(", appphone=").append(appphone);
        sb.append(", docid=").append(docid);
        sb.append(", deptid=").append(deptid);
        sb.append(", appodate=").append(appodate);
        sb.append(", appotime=").append(appotime);
        sb.append(", appcreatetime=").append(appcreatetime);
        sb.append("]");
        return sb.toString();
    }
}