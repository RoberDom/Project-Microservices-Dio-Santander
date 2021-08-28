package com.dio.carrinhoCompras.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Item")
public class Item {

    private Integer produtoId;
    private Integer quantidade;

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
