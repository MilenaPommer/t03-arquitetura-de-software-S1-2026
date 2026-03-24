package com.fag.lucasmartins.arquitetura_software.model.bo;

public class ProdutoBO {
    private String nome;
    private Double preco;
    private Double precoFinal;
    private Integer estoque;

    public ProdutoBO(String nome, Double preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        validarPremium();
        calcularPrecoFinal();
    }

    private void validarPremium() {
        if (this.nome != null && this.nome.toLowerCase().contains("premium") && this.preco < 100.0) {
            throw new IllegalArgumentException("Erro: Produtos Premium não podem custar menos de R$ 100,00.");
        }
    }

    private void calcularPrecoFinal() {
        if (this.estoque != null && this.estoque >= 50) {
            this.precoFinal = this.preco - (this.preco * 0.10);
        } else {
            this.precoFinal = this.preco;
        }
    }

    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
    public Double getPrecoFinal() { return precoFinal; }
    public Integer getEstoque() { return estoque; }
}