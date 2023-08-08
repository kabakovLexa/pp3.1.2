package com.example.pp3_1_2.web.dao;



import com.example.pp3_1_2.web.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> allUsers();
    public User getUserId(Long id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long id);
}
