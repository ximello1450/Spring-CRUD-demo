package com.SpringCRUD.demo.services;

import com.SpringCRUD.demo.model.Viaje;

import java.util.Optional;

public interface ViajeService {
    public Viaje save(Viaje viaje);
    public Optional<Viaje> getViaje(int id);
    public void delete(int id);
    public void updateViaje(Viaje viaje);
}
