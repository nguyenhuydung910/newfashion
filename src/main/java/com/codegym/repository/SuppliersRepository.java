package com.codegym.repository;

import com.codegym.model.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers, Long> {
    Iterable<Suppliers> findAllByName(String name);
}