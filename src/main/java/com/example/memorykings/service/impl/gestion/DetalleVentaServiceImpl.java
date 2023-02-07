package com.example.memorykings.service.impl.gestion;

import com.example.memorykings.entity.gestion.DetalleVentaEntity;
import com.example.memorykings.repository.DetalleVentaRepository;
import com.example.memorykings.service.gestion.DetalleVentaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService{
    
    @Autowired
    private DetalleVentaRepository repositorio;

    @Override
    public List<DetalleVentaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public DetalleVentaEntity add(DetalleVentaEntity t) {
        return repositorio.save(t);
    }

    @Override
    public Optional<DetalleVentaEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public DetalleVentaEntity update(DetalleVentaEntity t) {
        DetalleVentaEntity objcategoria = repositorio.getById(t.getCodigo());
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
