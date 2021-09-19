package com.joao.normando.produtos.controller;

import com.joao.normando.produtos.domain.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String findAll(){
        Produto produto = new Produto(1L,"Heineken", 20);
        return produto.toString();
    }
}