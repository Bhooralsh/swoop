package com.swoop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swoop.model.Role;


public interface RoleRepository extends JpaRepository<Role,Long> {

}
