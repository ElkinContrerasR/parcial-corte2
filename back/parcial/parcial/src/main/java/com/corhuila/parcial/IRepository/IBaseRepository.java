package com.corhuila.parcial.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.corhuila.parcial.Entity.ABaseEntity;

@Repository
public interface IBaseRepository<T extends ABaseEntity , ID> extends JpaRepository<T, Long> {
    
}
