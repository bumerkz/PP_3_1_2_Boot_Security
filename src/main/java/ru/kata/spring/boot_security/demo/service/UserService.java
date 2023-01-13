package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void addUser(User user);
    void updateUser (User user);
    void removeUser(Long id);
    User findUserById(Long id);
    List<User> getListUsers();
}
