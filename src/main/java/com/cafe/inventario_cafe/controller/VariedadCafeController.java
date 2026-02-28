package com.cafe.inventario_cafe.controller;

import com.cafe.inventario_cafe.entity.VariedadCafe;
import com.cafe.inventario_cafe.service.VariedadCafeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cafes")
public class VariedadCafeController {

    private final VariedadCafeService service;

    public VariedadCafeController(VariedadCafeService service) {
        this.service = service;
    }

    @PostMapping
    public VariedadCafe crear(@RequestBody VariedadCafe variedad) {
        return service.guardar(variedad);
    }

    @GetMapping
    public List<VariedadCafe> obtenerTodos() {
        return service.obtenerTodos();
    }
}
