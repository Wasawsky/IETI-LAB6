package eci.ieti.taskplannerapi.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import eci.ieti.taskplannerapi.entities.User;
import eci.ieti.taskplannerapi.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    
    private final List<User> users = new ArrayList<User>();

    public UserServiceImpl() {
        User user1 = new User("1","carlos", "carlos123", "carlos@yahoo.com");
        User user2 = new User("2","andres", "elmer123", "andres@yahoo.com");
        User user3 = new User("3","pedro", "internet", "pedro@yahoo.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }
    
    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        
        User us = null;
        for (User user : users) {
            if(user.getIdUser().equals(userId)){
                us=user;
                break;
            }
        }
        return us;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {

        System.out.println(users);
        User user2 = null;
        for (User us : users) {
            if(us.getIdUser().equals(user.getIdUser())){
                us.setEmail(user.getEmail());
                us.setName(user.getName());
                us.setPassword(user.getPassword());
                break;
            }
        }
        System.out.println(users);
        return user2;
    }

    @Override
    public void remove(String userId) {

        User usrem=null;

        for (User us : users) {
            if(us.getIdUser().equals(userId)){
                usrem=us;
                break;
            }
        }
        users.remove(usrem);
    }
    
}
