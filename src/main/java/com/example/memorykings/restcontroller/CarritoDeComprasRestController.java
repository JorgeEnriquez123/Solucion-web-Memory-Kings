package com.example.memorykings.restcontroller;

import com.example.memorykings.entity.gestion.CarritoDeComprasEntity;
import com.example.memorykings.entity.gestion.DetalleVentaEntity;
import com.example.memorykings.service.gestion.CarritoDeComprasService;
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
@RequestMapping("/carritodecompras")
public class CarritoDeComprasRestController {
    
    @Autowired
    private CarritoDeComprasService servicio;
    
    @GetMapping
    public List<CarritoDeComprasEntity>findAll(){
        return servicio.findAll();
    }
    
    @PostMapping
    public CarritoDeComprasEntity add(@RequestBody CarritoDeComprasEntity c){
        return servicio.add(c);
    }    
    
    @GetMapping("/{id}")
    public Optional<CarritoDeComprasEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PutMapping("/{id}")
    public CarritoDeComprasEntity update(@PathVariable Long id, @RequestBody CarritoDeComprasEntity c){
        c.getCodigo();
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        boolean respuesta = servicio.deletebyid(id);
        if(respuesta){
            return "Se elimino la fila de producto(s) correctamente";
        }
        else{
            return "No se pudo eliminar la fila de producto(s)";
        }
       
    }
}
