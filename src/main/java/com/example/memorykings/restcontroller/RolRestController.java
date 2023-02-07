
package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.RolEntity;
import com.example.memorykings.service.gestion.RolService;
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
@RequestMapping("/rol")
public class RolRestController {
    
    @Autowired
    private RolService servicio;
    
    @GetMapping
    public List<RolEntity>findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<RolEntity>findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @PostMapping
    public RolEntity add(@RequestBody RolEntity c){
        return servicio.add(c);
    }    
    
    @GetMapping("/{id}")
    public Optional<RolEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public RolEntity update(@PathVariable Long id, @RequestBody RolEntity c){
        c.getCodigo();
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable Long id){
        RolEntity objcategoria = new RolEntity();
        objcategoria.setCodigo(id);
        return servicio.delete(RolEntity.builder().codigo(id).build());
    }
}
