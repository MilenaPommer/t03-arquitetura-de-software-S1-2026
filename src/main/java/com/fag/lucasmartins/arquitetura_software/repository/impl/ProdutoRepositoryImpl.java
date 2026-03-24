package com.fag.lucasmartins.arquitetura_software.repository.impl;

import org.springframework.stereotype.Repository;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.repository.entity.ProdutoEntity;
import com.fag.lucasmartins.arquitetura_software.repository.jpa.ProdutoJpaRepository;
import com.fag.lucasmartins.arquitetura_software.repository.mapper.ProdutoRepositoryMapper;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {

    private final ProdutoJpaRepository jpaRepository;

    public ProdutoRepositoryImpl(ProdutoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ProdutoBO salvar(ProdutoBO produtoBO) {
        ProdutoEntity entity = ProdutoRepositoryMapper.toEntity(produtoBO);
        jpaRepository.save(entity);
        return produtoBO;
    }
}