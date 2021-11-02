package com.idat.remiseriamvc.demo.app.contracts;


import com.idat.remiseriamvc.demo.domain.entitys.Tariff;

import java.util.List;
import java.util.Optional;

public interface ITariffRepository {
    List<Tariff> getAll();

    Optional<Tariff> findById(int idTariff);

    Tariff save(Tariff tariff);

    void delete(int idTariff);
}
