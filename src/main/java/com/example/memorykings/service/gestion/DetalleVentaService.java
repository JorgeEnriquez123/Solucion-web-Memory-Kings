/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.memorykings.service.gestion;

import com.example.memorykings.entity.gestion.DetalleVentaEntity;
import com.example.memorykings.service.generic.GenericoService;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josep
 */
public interface DetalleVentaService{
    List<DetalleVentaEntity> findAll();
    DetalleVentaEntity add(DetalleVentaEntity t);
    Optional<DetalleVentaEntity> findById(long id);
    DetalleVentaEntity update(DetalleVentaEntity t);
    boolean deletebyid(long id);
}
