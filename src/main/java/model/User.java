package model;

import javax.persistence.*;

@Entity
@Table(name = "`User`")
@NamedQuery(name = User.GET_LIST, query = "select u from User u")
public class User {
    public static final String GET_LIST = "User.GET_LIST";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "old")
    private int old;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
