package com.ludlabs.ludlabs.service;


import com.ludlabs.ludlabs.entity.User;
import com.ludlabs.ludlabs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByNameAndPassword(String username, String password) {
        return userRepository.findByNameAndPassword(username, password);
    }
}
