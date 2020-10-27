package com.destination.travel.service;

import com.destination.travel.domain.ScenicDetail;
import org.springframework.stereotype.Service;

@Service
public interface ScenicDetailService {
    ScenicDetail getScenicDetailByScenicId(long scenicId);
}
