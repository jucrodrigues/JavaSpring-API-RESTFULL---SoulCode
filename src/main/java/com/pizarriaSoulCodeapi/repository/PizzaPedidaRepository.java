package com.pizarriaSoulCodeapi.repository;

import com.pizarriaSoulCodeapi.model.PizzaPedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaPedidaRepository extends JpaRepository<PizzaPedida, Long> {
}
