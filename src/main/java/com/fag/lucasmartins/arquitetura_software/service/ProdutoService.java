package com.fag.lucasmartins.arquitetura_software.service;

import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

public interface ProdutoService {
    ProdutoDTO cadastrarProduto(ProdutoDTO dto);
}