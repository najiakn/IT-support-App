package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Ticket;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TicketRepository  extends JpaRepository<Ticket,Integer > {

    Optional<Ticket> findAllByuserId(int Id);
}
