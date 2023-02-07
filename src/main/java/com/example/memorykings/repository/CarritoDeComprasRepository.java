
package com.example.memorykings.repository;

import com.example.memorykings.entity.gestion.CarritoDeComprasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoDeComprasRepository extends JpaRepository<CarritoDeComprasEntity, Long>{
}
