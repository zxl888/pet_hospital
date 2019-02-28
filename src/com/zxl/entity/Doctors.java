package com.zxl.entity;

public class Doctors {
    private Integer docid;

    private String doctel;

    private String docname;

    private String docsex;

    private Byte docage;

    private String doctitle;

    private Integer deptid;

    private String docfixed;

    private String docspec;

    private String docpic;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public String getDoctel() {
        return doctel;
    }

    public void setDoctel(String doctel) {
        this.doctel = doctel == null ? null : doctel.trim();
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname == null ? null : docname.trim();
    }

    public String getDocsex() {
        return docsex;
    }

    public void setDocsex(String docsex) {
        this.docsex = docsex == null ? null : docsex.trim();
    }

    public Byte getDocage() {
        return docage;
    }

    public void setDocage(Byte docage) {
        this.docage = docage;
    }

    public String getDoctitle() {
        return doctitle;
    }

    public void setDoctitle(String doctitle) {
        this.doctitle = doctitle == null ? null : doctitle.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDocfixed() {
        return docfixed;
    }

    public void setDocfixed(String docfixed) {
        this.docfixed = docfixed == null ? null : docfixed.trim();
    }

    public String getDocspec() {
        return docspec;
    }

    public void setDocspec(String docspec) {
        this.docspec = docspec == null ? null : docspec.trim();
    }

    public String getDocpic() {
        return docpic;
    }

    public void setDocpic(String docpic) {
        this.docpic = docpic == null ? null : docpic.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docid=").append(docid);
        sb.append(", doctel=").append(doctel);
        sb.append(", docname=").append(docname);
        sb.append(", docsex=").append(docsex);
        sb.append(", docage=").append(docage);
        sb.append(", doctitle=").append(doctitle);
        sb.append(", deptid=").append(deptid);
        sb.append(", docfixed=").append(docfixed);
        sb.append(", docspec=").append(docspec);
        sb.append(", docpic=").append(docpic);
        sb.append("]");
        return sb.toString();
    }
}