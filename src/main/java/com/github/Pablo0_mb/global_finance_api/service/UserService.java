package com.github.Pablo0_mb.global_finance_api.service;

import com.github.Pablo0_mb.global_finance_api.repository.entity.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity user);
}