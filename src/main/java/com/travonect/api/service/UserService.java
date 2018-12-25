package com.travonect.api.service;

import com.travonect.api.model.user.User;
import com.travonect.api.model.user.UserBasicInfo;
import com.travonect.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    public void deleteUserByEmail(String email) {
        userRepository.delete(this.getUserByEmail(email));
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
    
    public User updateUserBasicInfo(String email, UserBasicInfo userBasicInfo) {
        User user = getUserByEmail(email);
        user.setUserBasicInfo(userBasicInfo);
        return userRepository.save(user);
    }

}
