package com.dagger2.zeroscreen.mvp.model.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by hongwei on 2017/5/7.
 */
@Entity
public class CardInfo {

    @Id
    @Property(nameInDb = "id")
    private Long id;

    @Property(nameInDb = "name")
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 294799021)
    public CardInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 555217359)
    public CardInfo() {
    }
}
