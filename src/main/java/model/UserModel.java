package model;

import entity.User;

import java.util.List;

public interface UserModel {
    boolean save(User user);
    boolean update(int id, User userUpdate);
    boolean delete(int id);
    List<User>findAll();
    User findById(int id);
}
