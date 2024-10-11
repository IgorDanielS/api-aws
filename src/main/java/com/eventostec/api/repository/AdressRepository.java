package com.eventostec.api.repository;

import com.eventostec.api.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdressRepository extends JpaRepository<Adress, UUID> {
}
