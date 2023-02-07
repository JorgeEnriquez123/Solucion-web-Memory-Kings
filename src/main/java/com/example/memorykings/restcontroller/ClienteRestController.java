package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.ClienteEntity;
import com.example.memorykings.entity.gestion.ProductoEntity;
import com.example.memorykings.service.gestion.ClienteService;
import com.example.memorykings.service.gestion.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    
    @Autowired
    private ClienteService servicio;
    
    @GetMapping
    public List<ClienteEntity>findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ClienteEntity>findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return servicio.add(c);
    }    
    
    @GetMapping("/{id}")
    public Optional<ClienteEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable Long id, @RequestBody ClienteEntity c){
        c.getCodigo();
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable Long id){
        ClienteEntity objcategoria = new ClienteEntity();
        objcategoria.setCodigo(id);
        return servicio.delete(ClienteEntity.builder().codigo(id).build());
    }
}