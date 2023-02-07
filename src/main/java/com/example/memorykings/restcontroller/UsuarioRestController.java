package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.RolEntity;
import com.example.memorykings.entity.gestion.UsuarioEntity;
import com.example.memorykings.service.gestion.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioRestController {
    
    @Autowired
    private UsuarioService servicio;
    
    @GetMapping
    public List<UsuarioEntity>findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<UsuarioEntity>findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity c){
        return servicio.add(c);
    }    
    
    @GetMapping("/{id}")
    public Optional<UsuarioEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable Long id, @RequestBody UsuarioEntity c){
        c.getCodigo();
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable Long id){
        UsuarioEntity objcategoria = new UsuarioEntity();
        objcategoria.setCodigo(id);
        return servicio.delete(UsuarioEntity.builder().codigo(id).build());
    }
}