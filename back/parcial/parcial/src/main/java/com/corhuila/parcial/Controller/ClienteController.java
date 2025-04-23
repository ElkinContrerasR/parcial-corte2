package com.corhuila.parcial.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.parcial.Entity.Cliente;
import com.corhuila.parcial.IService.IClienteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/cliente")
public class ClienteController extends ABaseController<Cliente, IClienteService> {

    public ClienteController(IClienteService service) {
        super(service, "cliente");
    }
}
