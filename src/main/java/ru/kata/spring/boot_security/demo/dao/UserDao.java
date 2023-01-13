package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(Long id);
    User findUserById(Long id);
    User findUserByUserName(String username);
    List<User> getListUsers();
}
