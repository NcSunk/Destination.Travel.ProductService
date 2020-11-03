package com.destination.travel.product.service;

import com.destination.travel.basic.dto.CityDto;
import com.destination.travel.basic.dto.ScenicDto;
import org.springframework.stereotype.Service;

@Service
public interface BasicService {
    CityDto getCity(long id);
    ScenicDto getScenic(long id);
}
