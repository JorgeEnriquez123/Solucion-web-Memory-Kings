
package com.example.memorykings.entity.gestion;

import com.example.memorykings.entity.base.BaseCredencialesEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name="UsuarioEntity") 
@Table(name="usuario") 
public class UsuarioEntity extends BaseCredencialesEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private RolEntity rol;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    
}
