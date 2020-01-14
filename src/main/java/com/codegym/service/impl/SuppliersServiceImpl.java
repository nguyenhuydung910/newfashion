package com.codegym.service.impl;

import com.codegym.model.Suppliers;
import com.codegym.repository.SuppliersRepository;
import com.codegym.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuppliersServiceImpl implements SuppliersService {
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
        return suppliersRepository.findAllByName(name);
    }

    @Override
    public Suppliers save(Suppliers suppliers) {
        return suppliersRepository.save(suppliers);
    }

    @Override
    public void delete(Long id) {
        suppliersRepository.deleteById(id);
    }
}
