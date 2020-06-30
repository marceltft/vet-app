package com.apps.vet.services;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.apps.vet.entities.User;
import com.apps.vet.repos.UserRepository;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UUID saveUser(User user) {

        repository.save(user);
        return user.getId();
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        repository.delete(user);

    }

    @Override
    public User getUserById(UUID id) {

        return repository.getOne(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

}
