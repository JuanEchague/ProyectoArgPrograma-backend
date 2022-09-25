package com.gestion.portfolio.controlador;

import com.gestion.portfolio.excepciones.ResourceNotFoundException;
import com.gestion.portfolio.modelo.Item;
import com.gestion.portfolio.repositorio.ItemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // Buscar un item por id
    @GetMapping("/items/{id}")
    public ResponseEntity<Item> obtenerItemPorId(@PathVariable Long id){
        Item item = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(("No existe el item con el ID :"+ id)));
        return ResponseEntity.ok(item);
    }
    @PutMapping("/items/{id}")
    public ResponseEntity<Item> actualizarItem(@PathVariable Long id,@RequestBody Item detallesItem){
        Item item = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(("No existe el item con el ID :"+ id)));
        item.setNombre(detallesItem.getNombre());
        item.setComentario(detallesItem.getComentario());
        item.setEmail(detallesItem.getEmail());
        Item itemActualizado = repositorio.save(item);
        return ResponseEntity.ok(itemActualizado);
    }
}
