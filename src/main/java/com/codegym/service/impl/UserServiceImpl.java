package com.codegym.service.impl;

import com.codegym.model.Suppliers;
import com.codegym.repository.SuppliersRepository;
import com.codegym.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements SuppliersService {
    @Autowired
    private SuppliersRepository suppliersRepository;

    @Override
    public Suppliers findById(Long id) {
        return null;
    }

    @Override
    public Iterable<Suppliers> suppliersAll() {
        return suppliersRepository.findAll();
    }

    @Override
    public Iterable<Suppliers> findAllByName(String name) {
        return null;
    }

    @Override
    public Suppliers save(Suppliers suppliers) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}