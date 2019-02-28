package com.zxl.entity;

import java.util.Date;

public class Bills {
    private Integer billid;

    private String paystatus;

    private Integer petid;

    private Double chineseprices;

    private Double westermprices;

    private Double materialprices;

    private Double exanineprices;

    private Double registrationprices;

    private Double opsprices;

    private Double totalprices;

    private Date billcreatetime;

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus == null ? null : paystatus.trim();
    }

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public Double getChineseprices() {
        return chineseprices;
    }

    public void setChineseprices(Double chineseprices) {
        this.chineseprices = chineseprices;
    }

    public Double getWestermprices() {
        return westermprices;
    }

    public void setWestermprices(Double westermprices) {
        this.westermprices = westermprices;
    }

    public Double getMaterialprices() {
        return materialprices;
    }

    public void setMaterialprices(Double materialprices) {
        this.materialprices = materialprices;
    }

    public Double getExanineprices() {
        return exanineprices;
    }

    public void setExanineprices(Double exanineprices) {
        this.exanineprices = exanineprices;
    }

    public Double getRegistrationprices() {
        return registrationprices;
    }

    public void setRegistrationprices(Double registrationprices) {
        this.registrationprices = registrationprices;
    }

    public Double getOpsprices() {
        return opsprices;
    }

    public void setOpsprices(Double opsprices) {
        this.opsprices = opsprices;
    }

    public Double getTotalprices() {
        return totalprices;
    }

    public void setTotalprices(Double totalprices) {
        this.totalprices = totalprices;
    }

    public Date getBillcreatetime() {
        return billcreatetime;
    }

    public void setBillcreatetime(Date billcreatetime) {
        this.billcreatetime = billcreatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billid=").append(billid);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", petid=").append(petid);
        sb.append(", chineseprices=").append(chineseprices);
        sb.append(", westermprices=").append(westermprices);
        sb.append(", materialprices=").append(materialprices);
        sb.append(", exanineprices=").append(exanineprices);
        sb.append(", registrationprices=").append(registrationprices);
        sb.append(", opsprices=").append(opsprices);
        sb.append(", totalprices=").append(totalprices);
        sb.append(", billcreatetime=").append(billcreatetime);
        sb.append("]");
        return sb.toString();
    }
}