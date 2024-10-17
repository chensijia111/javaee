package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    @Override
    public void insert(){
        System.out.println("UserServiceImpl.insert()");
    }

    @Override
    public void update(){
        System.out.println("UserServiceImpl.update()");
    }
}
