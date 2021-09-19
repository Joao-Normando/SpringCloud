package com.joao.normando.produtos.domain;

public class Produto {

    private Long id;
    private String name;
    private Integer price;

    public Produto(Long id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Produto{"+
                "id="+id+
                ", name=' " + name+ '\''+
                ",amount=" + price+
                '}';

    }

}