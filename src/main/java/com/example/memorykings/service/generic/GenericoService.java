package com.example.memorykings.service.generic;

import java.util.List;
import java.util.Optional;

public interface GenericoService<T> {
    List<T> findAll();
    List<T> findAllCustom();
    T add(T t);
    Optional<T> findById(long id);
    T update(T t);
    T delete(T t);
}
