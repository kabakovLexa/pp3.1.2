package com.example.pp3_1_2.web.Dao;

import com.example.pp3_1_2.web.Model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;



import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserId(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> allUsers() {
        List<User> userList = new ArrayList<>();
        userList = entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
        return userList;

    }

    @Override
    public void updateUser(int id, User user) {
        User user1 = getUserId(id);
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        user1.setSalary(user.getSalary());

    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }


}
