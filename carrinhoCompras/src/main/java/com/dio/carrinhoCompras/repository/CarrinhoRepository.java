package com.dio.carrinhoCompras.repository;

import com.dio.carrinhoCompras.model.Carrinho;
import org.springframework.data.repository.CrudRepository;

public interface CarrinhoRepository extends CrudRepository<Carrinho, Integer> {
}
