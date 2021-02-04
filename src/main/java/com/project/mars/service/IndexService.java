package com.project.mars.service;

import com.project.mars.model.User;
import com.project.mars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IndexService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        Optional<User> foundUser = userRepository.findById(user.getId());
        if (foundUser.isPresent()) {
            User existingUser = foundUser.get();
            existingUser.setName(user.getName());
            existingUser.setPassword(user.getPassword());
            existingUser = userRepository.save(existingUser);
            return existingUser;
        } else {
            User newUser = userRepository.save(user);
            return newUser;
        }
        
    }
}
