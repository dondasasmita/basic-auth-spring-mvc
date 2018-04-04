package hello.service;

import hello.model.User;

public interface UserService {

    public User findUserByUsername (String username);
    public void saveUser(User user);

}
