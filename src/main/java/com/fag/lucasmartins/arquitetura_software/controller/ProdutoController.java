package com.fag.lucasmartins.arquitetura_software.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fag.lucasmartins.arquitetura_software.service.ProdutoService;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Object> cadastrarProduto(@RequestBody ProdutoDTO payload) {
        try {
            ProdutoDTO response = service.cadastrarProduto(payload);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar requisição: " + e.getMessage());
        }
    }
}