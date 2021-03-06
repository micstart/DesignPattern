package com.wangyao.dp.creational.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * ηζδΊ§ε
     */
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        System.out.println(product);
    }

}
