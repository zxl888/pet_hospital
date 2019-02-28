package com.zxl.entity;

public class Resourses {
    private Integer reid;

    private String rename;

    private String repic;

    private Double reprice;

    private String refunc;

    private String recate;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename == null ? null : rename.trim();
    }

    public String getRepic() {
        return repic;
    }

    public void setRepic(String repic) {
        this.repic = repic == null ? null : repic.trim();
    }

    public Double getReprice() {
        return reprice;
    }

    public void setReprice(Double reprice) {
        this.reprice = reprice;
    }

    public String getRefunc() {
        return refunc;
    }

    public void setRefunc(String refunc) {
        this.refunc = refunc == null ? null : refunc.trim();
    }

    public String getRecate() {
        return recate;
    }

    public void setRecate(String recate) {
        this.recate = recate == null ? null : recate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reid=").append(reid);
        sb.append(", rename=").append(rename);
        sb.append(", repic=").append(repic);
        sb.append(", reprice=").append(reprice);
        sb.append(", refunc=").append(refunc);
        sb.append(", recate=").append(recate);
        sb.append("]");
        return sb.toString();
    }
}