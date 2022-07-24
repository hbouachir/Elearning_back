package com.ines.elearning.Service;

import com.ines.elearning.Entity.User;

import javax.transaction.Transactional;
import java.util.List;

public interface IUserService {
    User save(User u);

    User findOne(long id);
    User updateUser(User u);


    void deleteUser(long id);

    List<User> findAll();
}
