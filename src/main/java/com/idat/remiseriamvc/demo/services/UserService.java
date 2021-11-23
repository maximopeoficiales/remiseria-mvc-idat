package com.idat.remiseriamvc.demo.services;

import com.idat.remiseriamvc.demo.models.User;
import com.idat.remiseriamvc.demo.shared.EncryptPassword;
import com.idat.remiseriamvc.demo.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return repository.getAll();
    }

    public Optional<User> findById(int idUser) {
        return repository.findById(idUser);
    }

    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public User save(User user) {
        user.setActive(true);
        user.setPassword(EncryptPassword.encrypt(user.getPassword()));
        return repository.save(user);
    }

    public boolean delete(int idUser) {
        User findUser = this.findById(idUser).map(driver -> {

            return driver;
        }).orElse(null);

        if (findUser != null){
            findUser.setActive(false);
            repository.save(findUser);
            return true;
        }
        return false;
    }
}
