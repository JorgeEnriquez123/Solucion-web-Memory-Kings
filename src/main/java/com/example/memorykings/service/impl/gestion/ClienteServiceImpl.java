package com.example.memorykings.service.impl.gestion;

import com.example.memorykings.entity.gestion.ClienteEntity;
import com.example.memorykings.repository.ClienteRepository;
import com.example.memorykings.service.gestion.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repositorio;

    @Override
    public List<ClienteEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ClienteEntity add(ClienteEntity t) {
        return repositorio.save(t);
    }

    @Override
    public Optional<ClienteEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public ClienteEntity update(ClienteEntity t) {
        ClienteEntity objcategoria = repositorio.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcategoria);
        return repositorio.save(objcategoria);
        
    }

    @Override
    public ClienteEntity delete(ClienteEntity t) {
        ClienteEntity objcategoria = repositorio.getById(t.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }
    
}
