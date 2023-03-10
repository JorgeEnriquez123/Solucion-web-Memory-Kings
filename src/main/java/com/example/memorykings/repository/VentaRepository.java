package com.example.memorykings.repository;

import com.example.memorykings.entity.gestion.VentaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<VentaEntity, Long>{
    @Query("select v from VentaEntity v where v.estado=1")
    List<VentaEntity> findAllCustom();
}
