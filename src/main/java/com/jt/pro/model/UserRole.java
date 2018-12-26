package com.jt.pro.model;

import java.util.List;
import java.util.Map;

public class UserRole<Mpa> {
    private Long id;
    private List<Role> list;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Role> getList() {
        return list;
    }

    public void setList(List<Role> list) {
        this.list = list;
    }

    public Map<User, Role> getMap() {
        return map;
    }

    public void setMap(Map<User, Role> map) {
        this.map = map;
    }

    private Map<User,Role>map;

}
