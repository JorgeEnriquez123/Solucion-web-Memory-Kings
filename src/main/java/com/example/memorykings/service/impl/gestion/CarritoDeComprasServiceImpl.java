package com.example.memorykings.service.impl.gestion;

import com.example.memorykings.entity.gestion.CarritoDeComprasEntity;
import com.example.memorykings.entity.gestion.DetalleVentaEntity;
import com.example.memorykings.repository.CarritoDeComprasRepository;
import com.example.memorykings.repository.DetalleVentaRepository;
import com.example.memorykings.service.gestion.CarritoDeComprasService;
import com.example.memorykings.service.gestion.DetalleVentaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoDeComprasServiceImpl implements CarritoDeComprasService{
    
    @Autowired
    private CarritoDeComprasRepository repositorio;

    @Override
    public List<CarritoDeComprasEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public CarritoDeComprasEntity add(CarritoDeComprasEntity t) {
        return repositorio.save(t);
    }

    @Override
    public Optional<CarritoDeComprasEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public CarritoDeComprasEntity update(CarritoDeComprasEntity t) {
        CarritoDeComprasEntity objcategoria = repositorio.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcategoria);
        return repositorio.save(objcategoria);
    }
    
    @Override
    public boolean deletebyid(long id) {
        try{
            repositorio.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }
    
}