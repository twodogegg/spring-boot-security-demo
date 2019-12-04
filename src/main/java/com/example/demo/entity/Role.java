package com.example.demo.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * User: twodogegg
 * DATE: 2019-12-02 17:59
 */
@Data
@Entity
public class Role implements GrantedAuthority {

    private static final long serialVersionUID = -151397317857025275L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users;

    @Override
    public String getAuthority() {
        return name;
    }

//    多对多查询角色有哪些权限
//    @ManyToMany
//    @JoinTable(name = "role_permission", joinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "permission_id", referencedColumnName = "id") })
//    private List<Permission> permissions;
}
