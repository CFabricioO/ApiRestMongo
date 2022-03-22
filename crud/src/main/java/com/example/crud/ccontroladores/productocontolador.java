package com.example.crud.ccontroladores;

import com.example.crud.modelos.produtco;
import com.example.crud.repositorios.IproductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.DELETE,RequestMethod.GET,
RequestMethod.PUT})
public class productocontolador {

    @Autowired
    private IproductoDao repository;

    @PostMapping("/producto")
    public produtco create(@Validated @RequestBody produtco p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<produtco> readAll(){
        return repository.findAll();
    }

    @PutMapping("/producto/{id}")
    public produtco update(@PathVariable String id, @Validated @RequestBody produtco p){
        return repository.save(p);
    }

    @DeleteMapping("/producto/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);
    }
}
