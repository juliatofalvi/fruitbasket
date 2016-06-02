package com.helloit.fruitbasket.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class Basket {

    private List<Fruit> fruits = new ArrayList<Fruit>();

    public void addFruit(final Fruit fruit) {
        fruits.add(fruit);
    }

    public List<Fruit> getFruits() {
        return Collections.unmodifiableList(fruits);   //azert h csak olvashato legyen a list, nem editalhato
    }








}
