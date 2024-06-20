package com.learn.dio.service;

import com.learn.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
