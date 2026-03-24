package com.fag.lucasmartins.arquitetura_software.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fag.lucasmartins.arquitetura_software.repository.entity.ProdutoEntity;

@Repository
public interface ProdutoJpaRepository extends JpaRepository<ProdutoEntity, Long> {
}