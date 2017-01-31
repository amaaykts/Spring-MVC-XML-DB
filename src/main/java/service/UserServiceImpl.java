package service;

import dao.UserDAO;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by aandreev on 01.02.2017.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    public int add(User user) {
        return userDAO.add(user);
    }

    public int delete(int id) {
        return userDAO.delete(id);
    }

    public User get(int id) {
        return userDAO.get(id);
    }

    public int update(User user) {
        return userDAO.update(user);
    }

    public List<User> list() {
        return userDAO.list();
    }
}
