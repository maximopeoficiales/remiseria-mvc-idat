package com.idat.remiseriamvc.demo.app.use_cases;

import com.idat.remiseriamvc.demo.domain.entitys.Role;
import com.idat.remiseriamvc.demo.infrastructure.web.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public List<Role> getAll() {
        return repository.getAll();
    }

    public Optional<Role> findById(int idRole) {
        return repository.findById(idRole);
    }

    public Role save(Role role) {
        return repository.save(role);
    }

    public boolean delete(int idRole) {
        return this.findById(idRole).map(driver -> {
            repository.delete(idRole);
            return true;
        }).orElse(false);
    }
}
