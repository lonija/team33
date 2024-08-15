package com.datorium.Datorium.API.CheeseShop.CheeseRepo;

import com.datorium.Datorium.API.CheeseShop.CheeseDTO.Cheese;

import java.util.ArrayList;

public class CheeseRepo {private ArrayList<Cheese> cheeses = new ArrayList<>();

    public int add(Cheese cheese) {
        cheeses.add(cheese);
        return cheeses.size();
    }

    public ArrayList<Cheese> getAllCheeses() {
        return cheeses;
    }

    public Cheese update(int cheeseIndex, Cheese updateCheeseDTO){
        var cheese = cheeses.get(cheeseIndex);
        cheese.name = updateCheeseDTO.name;
        return cheese;
    }
}