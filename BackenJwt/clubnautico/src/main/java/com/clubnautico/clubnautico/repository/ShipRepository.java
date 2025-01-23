package com.clubnautico.clubnautico.repository;

import com.clubnautico.clubnautico.entity.Ship;
import com.clubnautico.clubnautico.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ShipRepository extends JpaRepository<Ship, Long> {

    List<Ship> findByOwnerId(Long userId);
}
