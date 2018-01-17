package com.jk.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/11 0011.
 */
//对应mongodb数据的对象名
@Document(collection = "chanPinMongodb")//chanPinMongodb这个名字必须和mongodb的集合名保持一致，不然查不出来
public class ChanPinMongodb implements Serializable {

    private long id;//合同编号
    private String cname;//名称
    private String ctype;//产品类别
    private String czhuangtai;//产品状态
    private String claiyuan;//产品来源
    private Date cdate;//开通日期

    private String clilv;//产品利率（年）
    private String cqixian;//产品期限（期）
    private String chuankuanfangshi;//还款方式
    private String cedu;//额度（元）

    private long feng;//风控信息

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getCzhuangtai() {
        return czhuangtai;
    }

    public void setCzhuangtai(String czhuangtai) {
        this.czhuangtai = czhuangtai;
    }

    public String getClaiyuan() {
        return claiyuan;
    }

    public void setClaiyuan(String claiyuan) {
        this.claiyuan = claiyuan;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getClilv() {
        return clilv;
    }

    public void setClilv(String clilv) {
        this.clilv = clilv;
    }

    public String getCqixian() {
        return cqixian;
    }

    public void setCqixian(String cqixian) {
        this.cqixian = cqixian;
    }

    public String getChuankuanfangshi() {
        return chuankuanfangshi;
    }

    public void setChuankuanfangshi(String chuankuanfangshi) {
        this.chuankuanfangshi = chuankuanfangshi;
    }

    public String getCedu() {
        return cedu;
    }

    public void setCedu(String cedu) {
        this.cedu = cedu;
    }

    public long getFeng() {
        return feng;
    }

    public void setFeng(long feng) {
        this.feng = feng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChanPinMongodb that = (ChanPinMongodb) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "ChanPinMongodb{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", ctype='" + ctype + '\'' +
                ", czhuangtai='" + czhuangtai + '\'' +
                ", claiyuan='" + claiyuan + '\'' +
                ", cdate=" + cdate +
                ", clilv='" + clilv + '\'' +
                ", cqixian='" + cqixian + '\'' +
                ", chuankuanfangshi='" + chuankuanfangshi + '\'' +
                ", cedu='" + cedu + '\'' +
                ", feng=" + feng +
                '}';
    }


}
