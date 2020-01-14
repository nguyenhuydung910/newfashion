package com.codegym.service;

import com.codegym.model.Suppliers;

import java.util.Optional;

public interface SuppliersService {
    Suppliers  findById(Long id);

    Iterable<Suppliers> suppliersAll();

    Iterable<Suppliers> findAllByName(String name);

    Suppliers save(Suppliers suppliers);

    void delete(Long id);
}
