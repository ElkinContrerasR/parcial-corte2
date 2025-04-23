package com.corhuila.parcial.IRepository;

import org.springframework.stereotype.*;

import com.corhuila.parcial.Entity.Mesa;

@Repository
public interface IMesaRepository extends IBaseRepository<Mesa, Long> {
    
}
