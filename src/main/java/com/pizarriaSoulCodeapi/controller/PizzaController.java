package com.pizarriaSoulCodeapi.controller;

import com.pizarriaSoulCodeapi.model.Pizza;
import com.pizarriaSoulCodeapi.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @PostMapping
    public ResponseEntity<Pizza> criarPizza(@RequestBody Pizza pizza) {
        Pizza novaPizza = pizzaRepository.save(pizza);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPizza);
    }

    @GetMapping
    public ResponseEntity<List<Pizza>> buscarTodasPizzas() {
        List<Pizza> pizzas = pizzaRepository.findAll();
        if (pizzas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pizzas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> buscarPizzaPorId(@PathVariable Long id) {
        Optional<Pizza> pizzaOptional = pizzaRepository.findById(id);
        return pizzaOptional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPizzaPorId(@PathVariable Long id) {
        if (!pizzaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        pizzaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
