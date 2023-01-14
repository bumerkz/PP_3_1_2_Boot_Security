package ru.kata.spring.boot_security.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.service.UserServiceImpl;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class Util {
    @Autowired
    private final UserServiceImpl userService;

    public Util(UserServiceImpl userService) {
        this.userService = userService;
    }
    @PostConstruct
    public void addUserDB() {
        Set<Role> roleAdmin = new HashSet<>();
        Set<Role> roleUser = new HashSet<>();
        Role roleAd = new Role("ADMIN");
        Role roleUs = new Role("USER");
        userService.addRole(roleAd);
        userService.addRole(roleUs);
        roleAdmin.add(roleAd);
        roleAdmin.add(roleUs);
        roleUser.add(roleUs);
        User user1 = new User("SergeyKor","user", "123@ya.ru", 37, roleAdmin);
        User user2 = new User("User", "user", "125@ya.ru", 25, roleUser);
        userService.addUser(user1);
        userService.addUser(user2);
    }
}
