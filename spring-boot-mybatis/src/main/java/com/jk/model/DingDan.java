package com.jk.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DingDan implements Serializable{
    private static final long serialVersionUID = -7392113790367049016L;
    private Long did;

    private String dchanpintype;

    private Date ddate;

    private String ddiandanhao;

    private String dname;

    private String dzhanghao;

    private String dzhuangtai;

    private Long jid;

    private Long jieid;

    private Long qid;

    private Long yid;

    private String jname;

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDchanpintype() {
        return dchanpintype;
    }

    public void setDchanpintype(String dchanpintype) {
        this.dchanpintype = dchanpintype;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getDdiandanhao() {
        return ddiandanhao;
    }

    public void setDdiandanhao(String ddiandanhao) {
        this.ddiandanhao = ddiandanhao;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDzhanghao() {
        return dzhanghao;
    }

    public void setDzhanghao(String dzhanghao) {
        this.dzhanghao = dzhanghao;
    }

    public String getDzhuangtai() {
        return dzhuangtai;
    }

    public void setDzhuangtai(String dzhuangtai) {
        this.dzhuangtai = dzhuangtai;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public Long getJieid() {
        return jieid;
    }

    public void setJieid(Long jieid) {
        this.jieid = jieid;
    }

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public Long getYid() {
        return yid;
    }

    public void setYid(Long yid) {
        this.yid = yid;
    }

    @Override
    public String toString() {
        return "DingDan{" +
                "did=" + did +
                ", dchanpintype='" + dchanpintype + '\'' +
                ", ddate=" + ddate +
                ", ddiandanhao='" + ddiandanhao + '\'' +
                ", dname='" + dname + '\'' +
                ", dzhanghao='" + dzhanghao + '\'' +
                ", dzhuangtai='" + dzhuangtai + '\'' +
                ", jid=" + jid +
                ", jieid=" + jieid +
                ", qid=" + qid +
                ", yid=" + yid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DingDan dingDan = (DingDan) o;

        return did.equals(dingDan.did);

    }

    @Override
    public int hashCode() {
        return did.hashCode();
    }
}