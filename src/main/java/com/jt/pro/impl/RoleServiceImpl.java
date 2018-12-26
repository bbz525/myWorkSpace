package com.jt.pro.impl;

import com.jt.pro.model.Role;
import com.jt.pro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * comment:
 */
@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    private  Role role;
    @Override
    public void printRoleInfo() {
        System.out.println("id=" + role.getId());
        System.out.println("roleName=" + role.getRoleName());
        System.out.println("rolenote=" + role.getNote());

    }

    public static void main(String[] args) {
        new RoleServiceImpl().printRoleInfo();
    }
}
