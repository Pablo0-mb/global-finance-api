package com.github.Pablo0_mb.global_finance_api.service.impl;

import com.github.Pablo0_mb.global_finance_api.repository.UserRepository;
import com.github.Pablo0_mb.global_finance_api.repository.entity.UserEntity;
import com.github.Pablo0_mb.global_finance_api.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // It is like the constructor for UserRepository (lombok)
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserEntity createUser(UserEntity user){
        user.setPassword(passwordEncoder.encode(user.getPassword())); //To encode the password before saving it
        return userRepository.save(user);
    }
}
