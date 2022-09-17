package com.gestion.portfolio.controlador;

import com.gestion.portfolio.modelo.Item;
import com.gestion.portfolio.repositorio.ItemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")

public class ItemControlador {

    @Autowired
    private ItemRepositorio repositorio;

    //este metodo lista todos los items
    @GetMapping("/items")
    public List<Item> listarTodosLosItems(){
        return repositorio.findAll();
    }
    //guardar el item

    @PostMapping("/items")
    public Item guardarItem(@RequestBody Item item){
        return repositorio.save(item);
    }
}
