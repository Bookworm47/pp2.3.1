package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> allUsers();
    public User getUser(Long id);
    public void addUser(User user);
    public void updateUser(Long id,User user);
    public void deleteUser(Long id);
}
