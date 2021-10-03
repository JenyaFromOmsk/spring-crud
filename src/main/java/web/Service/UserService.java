package web.Service;

import web.Models.User;


import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> allUsers();
}