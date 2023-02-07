/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.memorykings.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder //Modo herencia de @Builder
@NoArgsConstructor //Constructor sin Parametros
@AllArgsConstructor
@Data //Get and Set
@MappedSuperclass //Mapear Herencia
public class BaseCredencialesEntity {
   
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "dni", nullable = false)
    private String dni;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "password", nullable = false)
    private String password;
}
