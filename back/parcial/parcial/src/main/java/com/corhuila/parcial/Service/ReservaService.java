package com.corhuila.parcial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.parcial.Entity.Reserva;
import com.corhuila.parcial.IRepository.IBaseRepository;

import com.corhuila.parcial.IRepository.IReservaRepository;

import com.corhuila.parcial.IService.IReservaService;

@Service
public class ReservaService extends ABaseService<Reserva> implements IReservaService {

    @Autowired
    private IReservaRepository repository;

    @Override
    protected IBaseRepository<Reserva, Long> getRepository() {
        return repository;
    }
    
}