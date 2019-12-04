package com.example.demo.repository;

import com.example.demo.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: twodogegg
 * DATE: 2019-12-03 12:57
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
