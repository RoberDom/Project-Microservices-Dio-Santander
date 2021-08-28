package com.digital.catalogoProdutos.repository;

import com.digital.catalogoProdutos.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProdutoRepository extends ElasticsearchRepository<Produto,Long> {
}
