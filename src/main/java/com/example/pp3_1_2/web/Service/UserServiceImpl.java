package com.example.pp3_1_2.web.Service;

import com.example.pp3_1_2.web.dao.UserDAO;
import com.example.pp3_1_2.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);

    }

    @Override
    public void updateUser(int id, User user) {
        userDAO.updateUser(id,user);

    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);

    }

    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override
    public User getUserId(int id) {
        return userDAO.getUserId(id);
    }
}
