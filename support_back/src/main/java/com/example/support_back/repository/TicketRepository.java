package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket,Integer > {
}
