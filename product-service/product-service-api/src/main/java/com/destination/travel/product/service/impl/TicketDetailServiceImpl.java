package com.destination.travel.product.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.destination.travel.product.domain.ticket.TicketDetail;
import com.destination.travel.product.mapper.ticket.TicketDetailMapper;
import com.destination.travel.product.service.TicketDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketDetailServiceImpl implements TicketDetailService {
    @Autowired
    TicketDetailMapper ticketDetailMapper;

    @Override
    public TicketDetail search(long ticketId) {
        return ticketDetailMapper.selectOne(Wrappers.<TicketDetail>lambdaQuery().eq(TicketDetail::getTicketId,ticketId));
    }
}
