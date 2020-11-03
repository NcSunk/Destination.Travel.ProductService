package com.destination.travel.product.service.impl;

import com.destination.travel.basic.dto.CityDto;
import com.destination.travel.basic.dto.ScenicDto;
import com.destination.travel.common.dto.ApiResponse;
import com.destination.travel.product.client.BasicServiceClient;
import com.destination.travel.product.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicServiceImpl implements BasicService {
    @Autowired
    BasicServiceClient basicServiceClient;

    @Override
    public CityDto getCity(long id) {
        ApiResponse<CityDto> response = basicServiceClient.getCity(id);
        return response.isSuccess()?response.getData():null;
    }

    @Override
    public ScenicDto getScenic(long id) {
        ApiResponse<ScenicDto> response=basicServiceClient.getScenic(id);
        return response.isSuccess()?response.getData():null;
    }
}
