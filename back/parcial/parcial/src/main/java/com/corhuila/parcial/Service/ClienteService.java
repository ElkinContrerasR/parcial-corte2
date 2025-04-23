package com.corhuila.parcial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.parcial.Entity.Cliente;
import com.corhuila.parcial.IRepository.IBaseRepository;
import com.corhuila.parcial.IRepository.IClienteRepository;
import com.corhuila.parcial.IService.IClienteService;

@Service
public class ClienteService extends ABaseService<Cliente> implements IClienteService {

    @Autowired
    private IClienteRepository repository;

    @Override
    protected IBaseRepository<Cliente, Long> getRepository() {
        return repository;
    }
    
}