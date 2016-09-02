package com.xuan.greendao3.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author xuanyouwu
 * @email xuanyouwu@163.com
 * @time 2016-09-02 11:13
 */
@Entity
public class User {

    @Id
    private String id;
    private String name;
    @Generated(hash = 1037321026)
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
