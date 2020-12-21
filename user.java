package com.maimoona.futureXUserApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigInteger;

@Entity
@IdClass(userid.class)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class user {
    @Id
    private BigInteger userid;
    @Id
    private BigInteger courseid;
    private String username;

    public user() {
    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
