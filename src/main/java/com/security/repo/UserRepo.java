package com.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.RegisterEntity;

public interface UserRepo extends JpaRepository<RegisterEntity, Long> {

}
