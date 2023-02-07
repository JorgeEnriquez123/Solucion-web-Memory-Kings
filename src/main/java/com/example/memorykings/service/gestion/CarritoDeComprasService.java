/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.memorykings.service.gestion;

import com.example.memorykings.entity.gestion.CarritoDeComprasEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josep
 */
public interface CarritoDeComprasService{
    List<CarritoDeComprasEntity> findAll();
    CarritoDeComprasEntity add(CarritoDeComprasEntity t);
    Optional<CarritoDeComprasEntity> findById(long id);
    CarritoDeComprasEntity update(CarritoDeComprasEntity t);
    boolean deletebyid(long id);
}
