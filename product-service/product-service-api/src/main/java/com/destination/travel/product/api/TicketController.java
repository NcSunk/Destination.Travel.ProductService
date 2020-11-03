package com.destination.travel.product.api;

import com.destination.travel.common.dto.ApiResponse;
import com.destination.travel.product.dto.TicketDetailDto;
import com.destination.travel.product.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ApiResponse<TicketDetailDto> getTicketDetail(@PathVariable("id") long id)
    {
        return ticketService.getTicketDetail(id);
    }
}
