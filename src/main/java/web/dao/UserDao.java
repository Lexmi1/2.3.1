package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void save(User user);

    User getUser(int id);

    void delete(int id);
}
