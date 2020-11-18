package com.destination.travel.product.service.impl;

import com.destination.travel.product.mapper.ticket.TicketTypeMapper;
import com.destination.travel.product.service.TicketTypeService;
import com.destination.travel.product.domain.ticket.TicketType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketTypeServiceImpl implements TicketTypeService {
    @Autowired
    TicketTypeMapper ticketTypeMapper;

    @Override
    public TicketType getTicketType(long id) {
        return ticketTypeMapper.selectById(id);
    }
}
