package eci.ieti.taskplannerapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import eci.ieti.taskplannerapi.entities.User;

@Service
public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}