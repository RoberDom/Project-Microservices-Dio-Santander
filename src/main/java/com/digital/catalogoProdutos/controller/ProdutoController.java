package com.digital.catalogoProdutos.controller;

import com.digital.catalogoProdutos.model.Produto;
import com.digital.catalogoProdutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/produto")

public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.POST)
    Produto create(@RequestBody Produto produto) {
        return produtoRepository.save (produto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Produto> findById(@PathVariable Long id) {
        return produtoRepository.findById (id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Produto update(@PathVariable Integer id, @RequestBody Produto produto) {
        return produtoRepository.save (produto);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void produtoDelete(@PathVariable Integer id,@RequestBody Produto produto ) {
        produtoRepository.delete (produto);
    }


    }