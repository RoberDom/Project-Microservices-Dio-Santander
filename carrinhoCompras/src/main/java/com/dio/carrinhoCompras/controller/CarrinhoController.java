package com.dio.carrinhoCompras.controller;

import com.dio.carrinhoCompras.model.Carrinho;
import com.dio.carrinhoCompras.model.Item;
import com.dio.carrinhoCompras.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(value = "/carrinho")

public class CarrinhoController {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Carrinho addItem(@PathVariable("id") Integer id, @RequestBody Item item){
        Optional<Carrinho> savedCart = carrinhoRepository.findById(id);
        Carrinho carrinho;

        if (savedCart.equals(Optional.empty())){
            carrinho = new Carrinho (id);
        }
        else{
            carrinho= savedCart.get();
        }
        carrinho.getItens().add(item);
        return carrinhoRepository.save (carrinho);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Carrinho> findById(@PathVariable("id") Integer id){
        return carrinhoRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id) {carrinhoRepository.deleteById(id);}
}
