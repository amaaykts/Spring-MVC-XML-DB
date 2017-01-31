package service;

import model.User;

import java.util.List;

/**
 * Created by aandreev on 01.02.2017.
 */
public interface UserService {
    int add(User user);
    int delete(int id);
    User get(int id);
    int update(User user);
    List<User> list();

}
