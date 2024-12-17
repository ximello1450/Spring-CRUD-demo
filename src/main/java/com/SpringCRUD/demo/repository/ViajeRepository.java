package com.SpringCRUD.demo.repository;

import com.SpringCRUD.demo.model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje,Integer> {

}
