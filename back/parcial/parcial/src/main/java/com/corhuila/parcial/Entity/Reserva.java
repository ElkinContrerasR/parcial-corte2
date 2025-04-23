package com.corhuila.parcial.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;


@Entity
@Table(name="reservas")
public class Reserva extends ABaseEntity{
    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;


    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre(LocalDate fecha) {
        this.fecha= fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora= hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
