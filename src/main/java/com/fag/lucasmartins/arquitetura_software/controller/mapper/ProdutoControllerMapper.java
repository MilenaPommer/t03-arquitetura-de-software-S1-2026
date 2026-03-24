package com.fag.lucasmartins.arquitetura_software.controller.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

public class ProdutoControllerMapper {
    
    public static ProdutoBO toBO(ProdutoDTO dto) {
        return new ProdutoBO(dto.getNome(), dto.getPreco(), dto.getEstoque());
    }

    public static ProdutoDTO toDTO(ProdutoBO bo, String mensagem) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setNome(bo.getNome());
        dto.setPreco(bo.getPreco());
        dto.setPrecoFinal(bo.getPrecoFinal());
        dto.setEstoque(bo.getEstoque());
        dto.setMensagem(mensagem);
        return dto;
    }
}