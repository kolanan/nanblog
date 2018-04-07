package com.dhl.cnnblogs.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private Date jointime;

    private String instroduction;

    private String imagepath;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return jointime
     */
    public Date getJointime() {
        return jointime;
    }

    /**
     * @param jointime
     */
    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    /**
     * @return instroduction
     */
    public String getInstroduction() {
        return instroduction;
    }

    /**
     * @param instroduction
     */
    public void setInstroduction(String instroduction) {
        this.instroduction = instroduction;
    }

    /**
     * @return imagepath
     */
    public String getImagepath() {
        return imagepath;
    }

    /**
     * @param imagepath
     */
    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}