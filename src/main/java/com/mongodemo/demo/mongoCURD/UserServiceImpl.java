package com.mongodemo.demo.mongoCURD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRespository userRespository;

    @Override
    public void save(User user) {
        userRespository.save(user);
    }

    @Override
    public User findUserByName(String name) {
        return userRespository.findByUserName(name);
    }
}
