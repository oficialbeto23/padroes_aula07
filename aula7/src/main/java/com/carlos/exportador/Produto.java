package com.carlos.exportador;

public class Produto {
    private long id;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Produto(long id, String descricao, String marca, String modelo, int estoque) {
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
    }
}
