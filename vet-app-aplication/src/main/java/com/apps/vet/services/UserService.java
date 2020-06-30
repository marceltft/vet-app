package com.apps.vet.services;

import java.util.List;
import java.util.UUID;

import com.apps.vet.entities.User;

public interface UserService {

    UUID saveUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    User getUserById(UUID id);

    List<User> getAllUsers();

}
