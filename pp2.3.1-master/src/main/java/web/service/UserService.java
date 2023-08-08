package web.service;


import web.model.User;

import java.util.List;

public interface UserService {

    public List<User> allUsers();
    public User getUser(Long id);
    public void addUser(User user);
    public void updateUser(Long id,User user);
    public void deleteUser(Long id);
}
