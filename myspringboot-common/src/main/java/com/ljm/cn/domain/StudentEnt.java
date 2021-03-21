package com.ljm.cn.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student1")
public class StudentEnt implements Serializable {

    @Id
    @Column(name = "sid")
    private long sid;

    @Column(name = "sname", nullable = true, length = 20)
    private String sname;

    @Column(name = "cid")
    private int cid;

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
