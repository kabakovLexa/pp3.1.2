package com.example.pp3_1_2.web.dao;



import com.example.pp3_1_2.web.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> allUsers();
    public User getUserId(int id);
    public void addUser(User user);
    public void updateUser(int id,User user);
    public void deleteUser(int id);
}
