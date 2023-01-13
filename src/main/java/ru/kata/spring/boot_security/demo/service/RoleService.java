package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.Set;

public interface RoleService {
    void addRole(Role role);
    Role getRoleById(Long id);

    Role getRoleByName (String name);
    public Set<Role> getRolesByName(Set<Role> roles);

    Set<Role> getAllRoles();
}
