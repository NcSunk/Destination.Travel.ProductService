package com.destination.travel.product.service;

import com.destination.travel.product.domain.TicketType;
import org.springframework.stereotype.Service;

@Service
public interface TicketTypeService {
    TicketType getTicketType(long id);
}
