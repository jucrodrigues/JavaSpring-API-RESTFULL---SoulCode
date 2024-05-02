package com.pizarriaSoulCodeapi.controller;

import com.pizarriaSoulCodeapi.model.Ingrediente;
import com.pizarriaSoulCodeapi.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @PostMapping
    public ResponseEntity<Ingrediente> salvarIngrediente(@RequestBody Ingrediente ingrediente) {
        Ingrediente novoIngrediente = ingredienteRepository.save(ingrediente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoIngrediente);
    }
}
