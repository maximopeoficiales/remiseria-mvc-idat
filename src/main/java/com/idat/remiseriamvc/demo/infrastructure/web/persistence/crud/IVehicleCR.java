package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface IVehicleCR extends CrudRepository<Vehicle, Integer> {

}
