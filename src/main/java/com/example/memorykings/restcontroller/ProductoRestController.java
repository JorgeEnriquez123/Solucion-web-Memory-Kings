
package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.ProductoEntity;
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
@RequestMapping("/producto")
public class ProductoRestController {
    
    @Autowired
    private ProductoService servicio;
    
    @GetMapping
    public List<ProductoEntity>findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ProductoEntity>findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity c){
        return servicio.add(c);
    }    
    
    @GetMapping("/{id}")
    public Optional<ProductoEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable Long id, @RequestBody ProductoEntity c){
        c.getCodigo();
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable Long id){
        ProductoEntity objcategoria = new ProductoEntity();
        objcategoria.setCodigo(id);
        return servicio.delete(ProductoEntity.builder().codigo(id).build());
    }
}
