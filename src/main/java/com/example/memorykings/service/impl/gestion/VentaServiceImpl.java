package com.example.memorykings.service.impl.gestion;

import com.example.memorykings.entity.gestion.VentaEntity;
import com.example.memorykings.repository.VentaRepository;
import com.example.memorykings.service.gestion.VentaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository repositorio;

    @Override
    public List<VentaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<VentaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public VentaEntity add(VentaEntity t) {
        return repositorio.save(t);
    }

    @Override
    public Optional<VentaEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public VentaEntity update(VentaEntity t) {
        VentaEntity objcategoria = repositorio.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcategoria);
        return repositorio.save(objcategoria);
    }
    
    @Override
    public VentaEntity delete(VentaEntity t) {
        VentaEntity objcategoria = repositorio.getById(t.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }
    
}