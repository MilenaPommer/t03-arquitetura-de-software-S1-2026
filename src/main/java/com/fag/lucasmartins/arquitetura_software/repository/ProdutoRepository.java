package com.fag.lucasmartins.arquitetura_software.repository;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;

public interface ProdutoRepository {
    ProdutoBO salvar(ProdutoBO produtoBO);
}