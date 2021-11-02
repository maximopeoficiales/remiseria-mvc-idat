package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.Permission;
import org.springframework.data.repository.CrudRepository;

public interface IPermissionCR extends CrudRepository<Permission, Integer> {

}
