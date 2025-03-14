package com.estagio.ticketservice.controller;

import com.estagio.ticketservice.model.Ticket;
import com.estagio.ticketservice.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/create-ticket")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @GetMapping("/get-ticket/{id}")
    public Optional<Ticket> getTicket(@PathVariable String id) {
        return ticketService.getTicketById(id);
    }

    @GetMapping("/get-all-tickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @DeleteMapping("/delete-ticket/{id}")
    public void deleteTicket(@PathVariable String id) {
        ticketService.deleteTicket(id);
    }
}
