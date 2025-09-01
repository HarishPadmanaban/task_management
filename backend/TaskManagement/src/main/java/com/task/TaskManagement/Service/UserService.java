package com.task.TaskManagement.Service;

import com.task.TaskManagement.Model.UserModel;
import com.task.TaskManagement.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public boolean createUser(UserModel user)
    {
        if(userRepository.existsById(user.getUserName()))
            return false;
        userRepository.save(user);
        return true;
    }

    public UserModel userLogin(String username, String password) {
        return userRepository.findById(username)
                .filter(u -> u.getPassword().equals(password))
                .orElse(null);
    }
}
