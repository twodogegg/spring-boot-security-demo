package com.example.demo.repository;

import com.example.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: twodogegg
 * DATE: 2019-12-02 18:09
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
//    @Query(value = "SELECT A.NAME AS roleName,C.url FROM role AS A LEFT JOIN role_permission B ON A.id=B.role_id LEFT JOIN permission AS C ON B.permission_id=C.id", nativeQuery = true)
//    List<RolePermission> getRolePermissions();
}
