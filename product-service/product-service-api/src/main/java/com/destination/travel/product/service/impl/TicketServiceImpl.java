package com.destination.travel.product.service.impl;

import com.destination.travel.basic.dto.CityDto;
import com.destination.travel.basic.dto.ScenicDto;
import com.destination.travel.common.dto.ApiResponse;
import com.destination.travel.common.enums.DataStatusEnum;
import com.destination.travel.common.util.BeanCopierUtil;
import com.destination.travel.product.domain.ticket.Ticket;
import com.destination.travel.product.domain.ticket.TicketDetail;
import com.destination.travel.product.domain.ticket.TicketType;
import com.destination.travel.product.dto.TicketDetailDto;
import com.destination.travel.product.mapper.ticket.TicketMapper;
import com.destination.travel.product.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketMapper ticketMapper;
    @Autowired
    TicketDetailService ticketDetailService;
    @Autowired
    BasicService basicService;
    @Autowired
    TicketTypeService ticketTypeService;

    @Override
    public ApiResponse<TicketDetailDto> getTicketDetail(long ticketId) {
        ApiResponse<TicketDetailDto> response=new ApiResponse<>();
        Ticket ticket=ticketMapper.selectById(ticketId);
        if(ticket==null||ticket.getStatus()== DataStatusEnum.Disabled)
        {
            response.setMessage("门票不存在或者已下架");
            response.setSuccess(false);
            return response;
        }
        TicketDetail ticketDetail=ticketDetailService.search(ticketId);
        response.setData(convert(ticket,ticketDetail));
        return response;
    }

    private TicketDetailDto convert(Ticket ticket,TicketDetail ticketDetail)
    {
        TicketDetailDto dto=new TicketDetailDto();
        BeanCopierUtil.copy(ticket,dto);
        if(ticketDetail!=null)
        {
            BeanCopierUtil.copy(ticketDetail,dto);
        }
        TicketType ticketType=ticketTypeService.getTicketType(ticket.getTicketTypeId());
        if(ticketType!=null)
        {
            dto.setTicketTypeName(ticketType.getName());
        }
        CityDto cityDto=basicService.getCity(ticket.getCityId());
        if(cityDto!=null)
        {
            dto.setCityName(cityDto.getName());
        }
        ScenicDto scenicDto=basicService.getScenic(ticket.getScenicId());
        if(scenicDto!=null)
        {
            dto.setScenicName(scenicDto.getName());
            dto.setScenicImage(scenicDto.getImage());
        }
        return dto;
    }
}
