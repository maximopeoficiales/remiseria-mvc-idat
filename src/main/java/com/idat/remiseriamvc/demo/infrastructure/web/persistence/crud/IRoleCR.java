package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleCR extends CrudRepository<Role, Integer> {
}
