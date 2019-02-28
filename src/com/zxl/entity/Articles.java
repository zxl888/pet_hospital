package com.zxl.entity;

import java.util.Date;

public class Articles {
    private Integer artid;

    private String artauth;

    private Date artcreatetime;

    private String artpic;

    private String artclassify;

    private String artdesc;

    public Integer getArtid() {
        return artid;
    }

    public void setArtid(Integer artid) {
        this.artid = artid;
    }

    public String getArtauth() {
        return artauth;
    }

    public void setArtauth(String artauth) {
        this.artauth = artauth == null ? null : artauth.trim();
    }

    public Date getArtcreatetime() {
        return artcreatetime;
    }

    public void setArtcreatetime(Date artcreatetime) {
        this.artcreatetime = artcreatetime;
    }

    public String getArtpic() {
        return artpic;
    }

    public void setArtpic(String artpic) {
        this.artpic = artpic == null ? null : artpic.trim();
    }

    public String getArtclassify() {
        return artclassify;
    }

    public void setArtclassify(String artclassify) {
        this.artclassify = artclassify == null ? null : artclassify.trim();
    }

    public String getArtdesc() {
        return artdesc;
    }

    public void setArtdesc(String artdesc) {
        this.artdesc = artdesc == null ? null : artdesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", artid=").append(artid);
        sb.append(", artauth=").append(artauth);
        sb.append(", artcreatetime=").append(artcreatetime);
        sb.append(", artpic=").append(artpic);
        sb.append(", artclassify=").append(artclassify);
        sb.append(", artdesc=").append(artdesc);
        sb.append("]");
        return sb.toString();
    }
}