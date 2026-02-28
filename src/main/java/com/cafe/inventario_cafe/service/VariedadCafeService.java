package com.cafe.inventario_cafe.service;

import com.cafe.inventario_cafe.entity.VariedadCafe;
import com.cafe.inventario_cafe.repository.VariedadCafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariedadCafeService {

    private final VariedadCafeRepository repository;

    public VariedadCafeService(VariedadCafeRepository repository) {
        this.repository = repository;
    }

    public VariedadCafe guardar(VariedadCafe variedad) {
        return repository.save(variedad);
    }

    public List<VariedadCafe> obtenerTodos() {
        return repository.findAll();
    }
}
