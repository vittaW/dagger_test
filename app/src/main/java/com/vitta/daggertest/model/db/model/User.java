package com.vitta.daggertest.model.db.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 12:15
 * 描述：User
 *
 * 表名 ： user表
 */
@Entity(nameInDb = "user")
public class User {

    //id 自增长
    @Id(autoincrement = true)
    private Long id;

    //属性
    @Property(nameInDb = "name")
    private String name;

    @Property
    private String create_at;

    @Property
    private String update_at;

    @Generated(hash = 1561201571)
    public User(Long id, String name, String create_at, String update_at) {
        this.id = id;
        this.name = name;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    @Generated(hash = 586692638)
    public User() {
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

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }
}
