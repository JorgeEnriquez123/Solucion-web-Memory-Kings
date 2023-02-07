
package com.example.memorykings.repository;


import com.example.memorykings.entity.gestion.UsuarioEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("select u from UsuarioEntity u where u.estado=1")
    List<UsuarioEntity> findAllCustom();
}
