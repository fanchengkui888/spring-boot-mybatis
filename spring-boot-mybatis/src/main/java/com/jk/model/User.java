package com.jk.model;

import java.util.Date;

public class User {
    private Long id;

    private String name;

    private String shenfenzheng;

    private Integer sex;

    private Integer xueli;

    private Integer hunyin;

    private String xianzhuzhi;

    private String hukousuozi;

    private Date userdate;

    private Long did;

    private Long jid;

    private String shoujihao;

    private String jinrongjname;//金融表，jname别名

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getXueli() {
        return xueli;
    }

    public void setXueli(Integer xueli) {
        this.xueli = xueli;
    }

    public Integer getHunyin() {
        return hunyin;
    }

    public void setHunyin(Integer hunyin) {
        this.hunyin = hunyin;
    }

    public String getXianzhuzhi() {
        return xianzhuzhi;
    }

    public void setXianzhuzhi(String xianzhuzhi) {
        this.xianzhuzhi = xianzhuzhi;
    }

    public String getHukousuozi() {
        return hukousuozi;
    }

    public void setHukousuozi(String hukousuozi) {
        this.hukousuozi = hukousuozi;
    }

    public Date getUserdate() {
        return userdate;
    }

    public void setUserdate(Date userdate) {
        this.userdate = userdate;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getShoujihao() {
        return shoujihao;
    }

    public void setShoujihao(String shoujihao) {
        this.shoujihao = shoujihao;
    }

    public String getJinrongjname() {
        return jinrongjname;
    }

    public void setJinrongjname(String jinrongjname) {
        this.jinrongjname = jinrongjname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shenfenzheng='" + shenfenzheng + '\'' +
                ", sex=" + sex +
                ", xueli=" + xueli +
                ", hunyin=" + hunyin +
                ", xianzhuzhi='" + xianzhuzhi + '\'' +
                ", hukousuozi='" + hukousuozi + '\'' +
                ", userdate=" + userdate +
                ", did=" + did +
                ", shoujihao='" + shoujihao + '\'' +
                ", jinrongjname='" + jinrongjname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals(user.id) : user.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}