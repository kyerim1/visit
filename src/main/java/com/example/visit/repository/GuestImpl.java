package com.example.visit.repository;

import com.example.visit.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestImpl extends JpaRepository<Guest,Long> {

    List<Guest> findAllByOrderByIdDesc();
}
