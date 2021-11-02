package com.idat.remiseriamvc.demo.app.contracts;


import com.idat.remiseriamvc.demo.domain.entitys.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {
    List<User> getAll();

    Optional<User> findById(int idUser);

    Optional<User> findByUsername(String username);

    User save(User user);

    void delete(int idUser);
}
