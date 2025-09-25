package com.secure.notes_follow_along.services;

import com.secure.notes_follow_along.dtos.UserDTO;
import com.secure.notes_follow_along.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
