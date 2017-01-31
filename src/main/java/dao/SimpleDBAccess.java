package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleDBAccess {
    @Autowired
    private SessionFactory sessionFactory;

    public String getVersion(){
        Session session = sessionFactory.openSession();
        String version = (String) session.createSQLQuery("SELECT version()").uniqueResult();
        session.close();
        return version;
    }
}
