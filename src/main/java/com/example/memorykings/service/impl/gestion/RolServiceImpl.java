
package com.example.memorykings.service.impl.gestion;

import com.example.memorykings.entity.gestion.RolEntity;
import com.example.memorykings.repository.RolRepository;
import com.example.memorykings.service.gestion.RolService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl implements RolService{

    @Autowired
    private RolRepository repositorio;

    @Override
    public List<RolEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public RolEntity add(RolEntity t) {
        return repositorio.save(t);
    }

    @Override
    public Optional<RolEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public RolEntity update(RolEntity t) {
        RolEntity objcategoria = repositorio.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcategoria);
        return repositorio.save(objcategoria);
        
    }

    @Override
    public RolEntity delete(RolEntity t) {
        RolEntity objcategoria = repositorio.getById(t.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }
    
}
