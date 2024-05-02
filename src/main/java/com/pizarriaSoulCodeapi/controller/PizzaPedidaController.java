package com.pizarriaSoulCodeapi.controller;

import com.pizarriaSoulCodeapi.model.PizzaPedida;
import com.pizarriaSoulCodeapi.repository.PizzaPedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas_pedidas")
public class PizzaPedidaController {

    @Autowired
    private PizzaPedidaRepository pizzaPedidaRepository;

    @PostMapping
    public ResponseEntity<PizzaPedida> salvarPizzaPedida(@RequestBody PizzaPedida pizzaPedida) {
        PizzaPedida novaPizzaPedida = pizzaPedidaRepository.save(pizzaPedida);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPizzaPedida);
    }

    @GetMapping
    public ResponseEntity<List<PizzaPedida>> buscarTodasPizzasPedidas() {
        List<PizzaPedida> pizzasPedidas = pizzaPedidaRepository.findAll();
        if (pizzasPedidas.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pizzasPedidas);
    }

}
