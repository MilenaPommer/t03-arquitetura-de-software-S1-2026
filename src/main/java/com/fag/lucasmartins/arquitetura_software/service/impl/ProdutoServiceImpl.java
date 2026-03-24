package com.fag.lucasmartins.arquitetura_software.service.impl;

import com.fag.lucasmartins.arquitetura_software.controller.mapper.ProdutoControllerMapper;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.service.ProdutoService;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProdutoDTO cadastrarProduto(ProdutoDTO dto) {
        ProdutoBO bo = ProdutoControllerMapper.toBO(dto);
        repository.salvar(bo);
        return ProdutoControllerMapper.toDTO(bo, "Produto cadastrado com sucesso!");
    }
}