package com.idat.remiseriamvc.demo.app.contracts;


import com.idat.remiseriamvc.demo.domain.entitys.Vehicle;

import java.util.List;
import java.util.Optional;

public interface IVehicleRepository {
    List<Vehicle> getAll();

    Optional<Vehicle> findById(int idVehicle);

    Vehicle save(Vehicle vehicle);

    void delete(int idVehicle);
}
