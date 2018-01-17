package com.jk.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/8 0008.
 */

public class JinRong implements Serializable {

//    @Id
//    @GeneratedValue
    private long jid;
//    @Column(nullable = true)
    private String jname;//产品名称
//    @Column(nullable = true)
    private String jjinkuanedu;//借款额度
//    @Column(nullable = true)
    private String jjinkuanqixian;//借款期限
//    @Column(nullable = true)
    private String jhuankuanfangshi;//还款方式
//    @Column(nullable = true)
    private String jhuankuanpinlv;//还款频率
//    @Column(nullable = true)
    private String jnianlilv;//年利率
//    @Column(nullable = true)
    private String jshiyirenqun;//适宜人群

    public long getJid() {
        return jid;
    }

    public void setJid(long jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getJjinkuanedu() {
        return jjinkuanedu;
    }

    public void setJjinkuanedu(String jjinkuanedu) {
        this.jjinkuanedu = jjinkuanedu;
    }

    public String getJjinkuanqixian() {
        return jjinkuanqixian;
    }

    public void setJjinkuanqixian(String jjinkuanqixian) {
        this.jjinkuanqixian = jjinkuanqixian;
    }

    public String getJhuankuanfangshi() {
        return jhuankuanfangshi;
    }

    public void setJhuankuanfangshi(String jhuankuanfangshi) {
        this.jhuankuanfangshi = jhuankuanfangshi;
    }

    public String getJhuankuanpinlv() {
        return jhuankuanpinlv;
    }

    public void setJhuankuanpinlv(String jhuankuanpinlv) {
        this.jhuankuanpinlv = jhuankuanpinlv;
    }

    public String getJnianlilv() {
        return jnianlilv;
    }

    public void setJnianlilv(String jnianlilv) {
        this.jnianlilv = jnianlilv;
    }

    public String getJshiyirenqun() {
        return jshiyirenqun;
    }

    public void setJshiyirenqun(String jshiyirenqun) {
        this.jshiyirenqun = jshiyirenqun;
    }

    @Override
    public String toString() {
        return "JinRong{" +
                "jid=" + jid +
                ", jname='" + jname + '\'' +
                ", jjinkuanedu='" + jjinkuanedu + '\'' +
                ", jjinkuanqixian='" + jjinkuanqixian + '\'' +
                ", jhuankuanfangshi='" + jhuankuanfangshi + '\'' +
                ", jhuankuanpinlv='" + jhuankuanpinlv + '\'' +
                ", jnianlilv='" + jnianlilv + '\'' +
                ", jshiyirenqun='" + jshiyirenqun + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JinRong jinRong = (JinRong) o;

        return jid == jinRong.jid;

    }

    @Override
    public int hashCode() {
        return (int) (jid ^ (jid >>> 32));
    }
}
