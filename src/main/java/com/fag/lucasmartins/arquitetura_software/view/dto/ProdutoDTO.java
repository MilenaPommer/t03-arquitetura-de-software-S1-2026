package com.fag.lucasmartins.arquitetura_software.view.dto;

public class ProdutoDTO {
    private String nome;
    private Double preco;
    private Double precoFinal;
    private Integer estoque;
    private String mensagem;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public Double getPrecoFinal() { return precoFinal; }
    public void setPrecoFinal(Double precoFinal) { this.precoFinal = precoFinal; }
    public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}