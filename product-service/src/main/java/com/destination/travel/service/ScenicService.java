package com.destination.travel.service;

import com.destination.travel.dto.ApiResponse;
import com.destination.travel.dto.ScenicDetailDto;
import org.springframework.stereotype.Service;

@Service
public interface ScenicService {
    ApiResponse<ScenicDetailDto> getScenicDetail(long id);
}
