package com.xuan.greendao3.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author xuanyouwu
 * @email xuanyouwu@163.com
 * @time 2016-09-02 11:17
 */

@Entity
public class Note {
    @Id
    private String id;
    private String title;
    @Generated(hash = 1773219525)
    public Note(String id, String title) {
        this.id = id;
        this.title = title;
    }
    @Generated(hash = 1272611929)
    public Note() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
}
