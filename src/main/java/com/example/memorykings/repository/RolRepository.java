
package com.example.memorykings.repository;

import com.example.memorykings.entity.gestion.RolEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Long>{
    @Query("select r from RolEntity r where r.estado=1")
    List<RolEntity> findAllCustom();
}
