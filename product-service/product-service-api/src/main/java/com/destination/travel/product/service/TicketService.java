package com.destination.travel.product.service;

import com.destination.travel.common.dto.ApiResponse;
import com.destination.travel.product.dto.TicketDetailDto;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
    ApiResponse<TicketDetailDto> getTicketDetail(long ticketId);
}
