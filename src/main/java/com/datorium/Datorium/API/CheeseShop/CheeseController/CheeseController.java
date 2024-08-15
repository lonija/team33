package com.datorium.Datorium.API.CheeseShop.CheeseController;

import com.datorium.Datorium.API.CheeseShop.CheeseDTO.Cheese;
import com.datorium.Datorium.API.CheeseShop.CheeseDTO.UpdateCheeseDTO;
import com.datorium.Datorium.API.CheeseShop.CheeseService.CheeseService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cheese")
public class CheeseController {

    private CheeseService cheeseService;

    public CheeseController() {
        cheeseService = new CheeseService();
    }

    @PostMapping("/add") //localhost:8080/cheese/add
    public int add(@RequestBody Cheese cheese) {
        return cheeseService.add(cheese);
    }

    @GetMapping("/all") //localhost:8080/cheese/all
    public ArrayList<Cheese> getAllCheeses() {
        return cheeseService.getAllCheeses();
    }

    @PostMapping("/update")
    public Cheese cheese(@RequestBody UpdateCheeseDTO updateCheeseDTO){
        return cheeseService.update(updateCheeseDTO.cheeseIndex, updateCheeseDTO.cheese);
    }

}
