package com.corhuila.parcial.IRepository;

import org.springframework.stereotype.*;

import com.corhuila.parcial.Entity.Cliente;

@Repository
public interface IClienteRepository extends IBaseRepository<Cliente, Long> {
    
}
