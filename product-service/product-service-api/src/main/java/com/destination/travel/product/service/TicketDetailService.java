package com.destination.travel.product.service;

import com.destination.travel.product.domain.ticket.TicketDetail;
import org.springframework.stereotype.Service;

@Service
public interface TicketDetailService {
    TicketDetail search(long ticketId);
}
