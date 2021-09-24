package com.msr.batter.entity;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-24 22:08:04
 */
public class User implements Serializable {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .toString();
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
}
