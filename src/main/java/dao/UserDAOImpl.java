package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Autowired
    SessionFactory sessionFactory;


    public int add(User user) {
        Session session = sessionFactory.openSession();
        Serializable id = session.save(user);
        session.close();
        return (Integer) id;
    }

    public int delete(int id) {
        return 0;
    }

    public User get(int id) {
        return null;
    }

    public int update(User user) {
        return 0;
    }

    public List<User> list() {
        Session session = sessionFactory.openSession();
        List<User> users = (List<User>) session.getNamedQuery(User.GET_LIST).list();
        session.close();
        return users;
    }
}
