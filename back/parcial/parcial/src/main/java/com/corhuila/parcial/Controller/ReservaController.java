package com.corhuila.parcial.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.corhuila.parcial.Entity.Reserva;

import com.corhuila.parcial.IService.IReservaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/reserva")
public class ReservaController extends ABaseController<Reserva, IReservaService> {

    public ReservaController(IReservaService service) {
        super(service, "reserva");
    }
}
