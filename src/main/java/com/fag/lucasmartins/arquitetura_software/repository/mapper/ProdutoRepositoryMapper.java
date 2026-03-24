package com.fag.lucasmartins.arquitetura_software.repository.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.repository.entity.ProdutoEntity;

public class ProdutoRepositoryMapper {

    public static ProdutoEntity toEntity(ProdutoBO bo) {
        ProdutoEntity entity = new ProdutoEntity();
        entity.setNome(bo.getNome());
        entity.setPreco(bo.getPreco());
        entity.setPrecoFinal(bo.getPrecoFinal());
        entity.setEstoque(bo.getEstoque());
        return entity;
    }
}