package shein.dmitriy.short_link.service;

import shein.dmitriy.short_link.entity.User;

import java.util.List;

public interface UserService {

    User registration(User user);

    List<User> findAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
