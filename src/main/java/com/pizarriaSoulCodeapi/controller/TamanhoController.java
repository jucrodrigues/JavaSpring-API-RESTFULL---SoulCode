package com.pizarriaSoulCodeapi.controller;

import com.pizarriaSoulCodeapi.model.Tamanho;
import com.pizarriaSoulCodeapi.repository.TamanhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tamanhos")
public class TamanhoController {

    @Autowired
    private TamanhoRepository tamanhoRepository;

    @PostMapping
    public ResponseEntity<Tamanho> salvarTamanho(@RequestBody Tamanho tamanho) {
        Tamanho valorTamanho = tamanhoRepository.save(tamanho);
        return ResponseEntity.status(HttpStatus.CREATED).body(valorTamanho);
    }

}
