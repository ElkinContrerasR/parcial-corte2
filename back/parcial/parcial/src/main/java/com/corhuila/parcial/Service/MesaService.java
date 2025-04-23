package com.corhuila.parcial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.parcial.Entity.Mesa;
import com.corhuila.parcial.IRepository.IBaseRepository;

import com.corhuila.parcial.IRepository.IMesaRepository;

import com.corhuila.parcial.IService.IMesaService;

@Service
public class MesaService extends ABaseService<Mesa> implements IMesaService {

    @Autowired
    private IMesaRepository repository;

    @Override
    protected IBaseRepository<Mesa, Long> getRepository() {
        return repository;
    }
    
}