package com.SpringCRUD.demo.services;

import com.SpringCRUD.demo.model.Viaje;
import com.SpringCRUD.demo.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ViajeServiceImpl implements ViajeService{

    @Autowired
    private ViajeRepository viajeRepository;
    @Override
    public Viaje save(Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    @Override
    public Optional<Viaje> getViaje(int id) {
        return viajeRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        viajeRepository.deleteById(id);
    }

    @Override
    public void updateViaje(Viaje viaje) {
        viajeRepository.save(viaje);
    }
}
