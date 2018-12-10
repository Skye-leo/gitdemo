package com.mongodemo.demo.mongoCURD;

public interface UserService {

    void save(User user);

    User findUserByName(String name);

}
