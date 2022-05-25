package model;

import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlUserModel {
    public boolean save(User user) {
        Connection connection = ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users (username, passwordHash, status) values(?, ?,?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, user.getStatus());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    public boolean update(int id, User userUpdate) {
        return false;
    }

    public boolean delete(int id) {
        return false;
    }

    public List<User> findAll() {
        return null;
    }

    public User findById(int id) {
        return null;
    }
}
