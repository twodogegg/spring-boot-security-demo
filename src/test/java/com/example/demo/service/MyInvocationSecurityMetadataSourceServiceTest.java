package com.example.demo.service;

import com.example.demo.entity.Permission;
import com.example.demo.entity.Role;
import com.example.demo.repository.PermissionRepository;
import com.example.demo.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.access.method.P;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: twodogegg
 * DATE: 2019-12-03 11:43
 */
@SpringBootTest
class MyInvocationSecurityMetadataSourceServiceTest {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    private static HashMap<String, Collection<ConfigAttribute>> map = null;

    @Test
    @Transactional
    void loadResourceDefine() {
//        List<Role> roles = roleRepository.findAll();
//        Permission permission = permissionRepository.getOne(1);
        map = new HashMap<>(16);
        List<Permission> permissions = permissionRepository.findAll();
        for (Permission permission : permissions) {
            String url = permission.getUrl();
            List<ConfigAttribute> list = new ArrayList<>();
            for (Role role : permission.getRoles()) {
                ConfigAttribute role1 = new SecurityConfig(role.getName());
                list.add(role1);
            }
            map.put(url, list);
        }
        System.out.println(map);
    }
}