package com.github.Pablo0_mb.global_finance_api.repository;

import com.github.Pablo0_mb.global_finance_api.repository.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Gets all the methods from Spring Data: save, select, insert...
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
