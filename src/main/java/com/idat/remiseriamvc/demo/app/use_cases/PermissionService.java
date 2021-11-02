package com.idat.remiseriamvc.demo.app.use_cases;

import com.idat.remiseriamvc.demo.domain.entitys.Permission;
import com.idat.remiseriamvc.demo.infrastructure.web.persistence.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository repository;

    public List<Permission> getAll() {
        return repository.getAll();
    }

    public Optional<Permission> findById(int idPermission) {
        return repository.findById(idPermission);
    }

    public Permission save(Permission permission) {
        return repository.save(permission);
    }

    public boolean delete(int idPermission) {
        return this.findById(idPermission).map(driver -> {
            repository.delete(idPermission);
            return true;
        }).orElse(false);
    }
}
