package dao;

import model.User;

import java.util.List;

public interface UserDAO {
    int add(User user);
    int delete(int id);
    User get(int id);
    int update(User user);
    List<User> list();
}
