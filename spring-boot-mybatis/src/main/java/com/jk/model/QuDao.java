package com.jk.model;

public class QuDao {
    private Long qid;

    private String qgongsidizhi;

    private String qgongsiname;

    private String qlaiyuan;

    private String qlianxidianhua;

    private String qname;

    private String qqid;

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public String getQgongsidizhi() {
        return qgongsidizhi;
    }

    public void setQgongsidizhi(String qgongsidizhi) {
        this.qgongsidizhi = qgongsidizhi == null ? null : qgongsidizhi.trim();
    }

    public String getQgongsiname() {
        return qgongsiname;
    }

    public void setQgongsiname(String qgongsiname) {
        this.qgongsiname = qgongsiname == null ? null : qgongsiname.trim();
    }

    public String getQlaiyuan() {
        return qlaiyuan;
    }

    public void setQlaiyuan(String qlaiyuan) {
        this.qlaiyuan = qlaiyuan == null ? null : qlaiyuan.trim();
    }

    public String getQlianxidianhua() {
        return qlianxidianhua;
    }

    public void setQlianxidianhua(String qlianxidianhua) {
        this.qlianxidianhua = qlianxidianhua == null ? null : qlianxidianhua.trim();
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    public String getQqid() {
        return qqid;
    }

    public void setQqid(String qqid) {
        this.qqid = qqid == null ? null : qqid.trim();
    }
}