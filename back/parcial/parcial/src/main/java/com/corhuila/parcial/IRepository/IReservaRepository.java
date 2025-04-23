package com.corhuila.parcial.IRepository;

import org.springframework.stereotype.*;

import com.corhuila.parcial.Entity.Reserva;

@Repository
public interface IReservaRepository extends IBaseRepository<Reserva, Long> {
    
}
