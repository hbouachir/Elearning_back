package com.ines.elearning.Service;

import com.ines.elearning.Entity.User;
import com.ines.elearning.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User save(User u) {
        return userRepository.save(u);
    }

    @Override
    public User findOne(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);

    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
