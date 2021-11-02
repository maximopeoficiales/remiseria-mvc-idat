package com.idat.remiseriamvc.demo.app.contracts;


import com.idat.remiseriamvc.demo.domain.entitys.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleRepository {
    List<Role> getAll();

    Optional<Role> findById(int idRole);

    Role save(Role role);

    void delete(int idRole);
}
