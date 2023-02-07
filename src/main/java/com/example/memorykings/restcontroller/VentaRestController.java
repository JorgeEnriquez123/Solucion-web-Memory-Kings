package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.RolEntity;
import com.example.memorykings.entity.gestion.UsuarioEntity;
import com.example.memorykings.entity.gestion.VentaEntity;
import com.example.memorykings.service.gestion.UsuarioService;
import com.example.memorykings.service.gestion.VentaService;
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
@RequestMapping("/venta")
public class VentaRestController {
    
    @Autowired
    private VentaService servicio;
    
    @GetMapping
    public List<VentaEntity>findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<VentaEntity>findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @PostMapping
    public VentaEntity add(@RequestBody VentaEntity c){
        return servicio.add(c);
    }    
    
    @GetMapping("/{id}")
    public Optional<VentaEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public VentaEntity update(@PathVariable Long id, @RequestBody VentaEntity c){
        c.getCodigo();
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public VentaEntity delete(@PathVariable Long id){
        VentaEntity objcategoria = new VentaEntity();
        objcategoria.setCodigo(id);
        return servicio.delete(VentaEntity.builder().codigo(id).build());
    }
}