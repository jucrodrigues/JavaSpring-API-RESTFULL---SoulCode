package com.pizarriaSoulCodeapi.repository;

import com.pizarriaSoulCodeapi.model.Tamanho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TamanhoRepository extends JpaRepository<Tamanho, Long> {
}
