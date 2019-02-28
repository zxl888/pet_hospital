package com.zxl.entity;

public class Pets {
    private Integer pid;

    private String pname;

    private String powner;

    private String poidcard;

    private String psex;

    private Double page;

    private Integer breid;

    private Double weight;

    private String dietary;

    private String sterilizing;

    private String ppic;

    private Byte ownertel;

    private Integer docid;

    private String symptom;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPowner() {
        return powner;
    }

    public void setPowner(String powner) {
        this.powner = powner == null ? null : powner.trim();
    }

    public String getPoidcard() {
        return poidcard;
    }

    public void setPoidcard(String poidcard) {
        this.poidcard = poidcard == null ? null : poidcard.trim();
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex == null ? null : psex.trim();
    }

    public Double getPage() {
        return page;
    }

    public void setPage(Double page) {
        this.page = page;
    }

    public Integer getBreid() {
        return breid;
    }

    public void setBreid(Integer breid) {
        this.breid = breid;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDietary() {
        return dietary;
    }

    public void setDietary(String dietary) {
        this.dietary = dietary == null ? null : dietary.trim();
    }

    public String getSterilizing() {
        return sterilizing;
    }

    public void setSterilizing(String sterilizing) {
        this.sterilizing = sterilizing == null ? null : sterilizing.trim();
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic == null ? null : ppic.trim();
    }

    public Byte getOwnertel() {
        return ownertel;
    }

    public void setOwnertel(Byte ownertel) {
        this.ownertel = ownertel;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom == null ? null : symptom.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pname=").append(pname);
        sb.append(", powner=").append(powner);
        sb.append(", poidcard=").append(poidcard);
        sb.append(", psex=").append(psex);
        sb.append(", page=").append(page);
        sb.append(", breid=").append(breid);
        sb.append(", weight=").append(weight);
        sb.append(", dietary=").append(dietary);
        sb.append(", sterilizing=").append(sterilizing);
        sb.append(", ppic=").append(ppic);
        sb.append(", ownertel=").append(ownertel);
        sb.append(", docid=").append(docid);
        sb.append(", symptom=").append(symptom);
        sb.append("]");
        return sb.toString();
    }
}