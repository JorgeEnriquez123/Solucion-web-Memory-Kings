package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.DetalleVentaEntity;
import com.example.memorykings.service.gestion.DetalleVentaService;
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
@RequestMapping("/detalleventa")
public class DetalleVentaRestController {
    
    @Autowired
    private DetalleVentaService servicio;
    
    @GetMapping
    public List<DetalleVentaEntity>findAll(){
        return servicio.findAll();
    }
    
    @PostMapping
    public DetalleVentaEntity add(@RequestBody DetalleVentaEntity d){
        return servicio.add(d);
    }    
    
    @GetMapping("/{id}")
    public Optional<DetalleVentaEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public DetalleVentaEntity update(@PathVariable Long id, @RequestBody DetalleVentaEntity d){
        d.getCodigo();
        return servicio.update(d);
    }
    
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        boolean respuesta = servicio.deletebyid(id);
        if(respuesta){
            return "Se elimino el detalle de venta correctamente";
        }
        else{
            return "No se pudo eliminar el detalle de venta";
        }
       
    }
}
