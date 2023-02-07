
package com.example.memorykings.service.impl.gestion;

import com.example.memorykings.entity.gestion.UsuarioEntity;
import com.example.memorykings.repository.UsuarioRepository;
import com.example.memorykings.service.gestion.UsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository repositorio;

    @Override
    public List<UsuarioEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public UsuarioEntity add(UsuarioEntity t) {
        return repositorio.save(t);
    }

    @Override
    public Optional<UsuarioEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity t) {
        UsuarioEntity objcategoria = repositorio.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcategoria);
        return repositorio.save(objcategoria);
        
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity t) {
        UsuarioEntity objcategoria = repositorio.getById(t.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }
    
}
