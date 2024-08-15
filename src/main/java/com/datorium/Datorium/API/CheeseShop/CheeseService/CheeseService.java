package com.datorium.Datorium.API.CheeseShop.CheeseService;

import com.datorium.Datorium.API.CheeseShop.CheeseDTO.Cheese;
import com.datorium.Datorium.API.CheeseShop.CheeseRepo.CheeseRepo;

import java.util.ArrayList;

public class CheeseService {

    private CheeseRepo cheeseRepo;

    public CheeseService() {
        cheeseRepo = new CheeseRepo();
    }

    public int add(Cheese cheese) {
        return cheeseRepo.add(cheese);
    }

    public ArrayList<Cheese> getAllCheeses() {
        return cheeseRepo.getAllCheeses();
    }

    public Cheese update(int cheeseIndex, Cheese updateCheeseDTO){
        return cheeseRepo.update(cheeseIndex, updateCheeseDTO);
    }

}

